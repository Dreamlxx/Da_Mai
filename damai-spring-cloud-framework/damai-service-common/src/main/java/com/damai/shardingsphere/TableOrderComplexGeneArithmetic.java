package com.damai.shardingsphere;

import cn.hutool.core.collection.CollectionUtil;
import com.damai.enums.BaseCode;
import com.damai.exception.DaMaiFrameException;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 订单分表算法（基因法方案1）
 * 
 * 核心设计：
 * - 订单号生成时固定嵌入userId后6位作为基因
 * - 分表时取低N位作为表索引（N = log2(表数量)）
 * - 配置驱动：扩容时只需修改yaml配置，无需改代码
 * 
 * 基因位分布（userId后6位）：
 * - 低位：表基因（log2(表数量)位）
 * - 中位：库基因（log2(库数量)位）
 * 
 * 示例（2库4表 → 8库8表扩容）：
 * - 当前：取bit0-1作为表索引（低2位）
 * - 扩容后：取bit0-2作为表索引（低3位）
 * 
 * @author: 阿星不是程序员
 **/
public class TableOrderComplexGeneArithmetic implements ComplexKeysShardingAlgorithm<Long> {
    
    /**
     * 属性分表名
     * */
    private static final String SHARDING_COUNT_KEY_NAME = "sharding-count";
    /**
     * 分表数量
     * */
    private int shardingCount;
    
    @Override
    public void init(Properties props) {
        shardingCount = Integer.parseInt(props.getProperty(SHARDING_COUNT_KEY_NAME));
    }


    /**
     * 通过sql语句,传进来查询的表名字,分片段名和查询的条件
     * 传入的两个参数,头参是实际所有分表表集合;
     * 二参是一个键值对集合
     *                  key->sql中的分表名字
     *                  value->查询条件,where代表集合里只有一对数据.若是in条件就代表有多对数据.
     */
    @Override
    public Collection<String> doSharding(Collection<String> allActualSplitTableNames, ComplexKeysShardingValue<Long> complexKeysShardingValue) {
        //1.获取传入的逻辑表名以及查询条件
        List<String> actualTableName =new ArrayList<>(allActualSplitTableNames.size());//先规定数组大小
        String logicTableName = complexKeysShardingValue.getLogicTableName();
        Map<String,Collection<Long>>columnNameAndShardingValuesMap=complexKeysShardingValue.getColumnNameAndShardingValuesMap();

        //2.如果没有查询条件,就返回所有分表
        if (CollectionUtil.isEmpty(columnNameAndShardingValuesMap)){
            return allActualSplitTableNames;
        }

        //3.有查询条件,获取sql语句中的分片键的值
        Collection<Long> orderNumberValue=columnNameAndShardingValuesMap.get("order_number");
        Collection<Long> userIdValue=columnNameAndShardingValuesMap.get("user_id");

        //4.看集合是不是不为空
        Long value=null;
        if (CollectionUtil.isNotEmpty(orderNumberValue))
        {
            value=orderNumberValue.stream().findFirst()
                    .orElseThrow(
                            ()->new DaMaiFrameException(BaseCode.ORDER_NUMBER_NOT_EXIST)
                    );
        }else if (CollectionUtil.isNotEmpty(userIdValue))
        {
            value=orderNumberValue.stream().findFirst()
                    .orElseThrow(
                            ()->new DaMaiFrameException(BaseCode.USER_ID_NOT_EXIST)
                    );
        }


        //TODO 为什么LIST可以直接在Collection中返回
        //5.若value不为空,则进行运算加字符串拼接
        if(value!=null){
            actualTableName.add(logicTableName+"_"+(value&(shardingCount-1)));
            return actualTableName;
        }
        return allActualSplitTableNames;
    }
}
