package com.damai.shardingsphere;

import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;
import java.util.Properties;
/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 订单分库算法（基因法方案1）
 * 
 * 核心设计：
 * - 订单号生成时固定嵌入userId后6位作为基因
 * - 分库时跳过表基因位，取中间的库基因位
 * - 配置驱动：扩容时只需修改yaml配置，无需改代码
 * 
 * 基因位分布（userId后6位）：
 * - 低位：表基因（log2(表数量)位）
 * - 中位：库基因（log2(库数量)位）
 * 
 * 示例（2库4表 → 8库8表扩容）：
 * - 当前：取bit2作为库索引（右移2位后取低1位）
 * - 扩容后：取bit3-5作为库索引（右移3位后取低3位）
 * 
 * @author: 阿星不是程序员
 **/
public class DatabaseOrderComplexGeneArithmetic implements ComplexKeysShardingAlgorithm<Long> {
    /**
     * 属性分库名
     * */
    private static final String SHARDING_COUNT_KEY_NAME = "sharding-count";
    
    /**
     * 属性分表名
     * */
    private static final String TABLE_SHARDING_COUNT_KEY_NAME = "table-sharding-count";
    
    /**
     * 分库数量
     * */
    private int shardingCount;
    
    /**
     * 分表数量
     * */
    private int tableShardingCount;
    
    @Override
    public void init(Properties props) {
        this.shardingCount = Integer.parseInt(props.getProperty(SHARDING_COUNT_KEY_NAME));
        this.tableShardingCount = Integer.parseInt(props.getProperty(TABLE_SHARDING_COUNT_KEY_NAME));
    }
    

    @Override
    public Collection<String> doSharding(Collection<String> allActualSplitDatabaseNames,
                                         ComplexKeysShardingValue<Long> complexKeysShardingValue) {
        //TODO 自己实现

        return null;
    }
}
