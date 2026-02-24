package com.damai.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.damai.dto.OrderPageManageDto;
import com.damai.dto.RecordManageDto;
import com.damai.vo.DiscardOrderManageVo;
import com.damai.vo.OrderManageVo;
import com.damai.vo.RecordOrderManageVo;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 订单后台管理 service
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class OrderManageService {
    
    
    
    public IPage<RecordOrderManageVo> recordPage(RecordManageDto recordManageDto) {
        //TODO 自己实现
        return null;
    }
    
    public IPage<OrderManageVo> orderPage(OrderPageManageDto orderPageManageDto) {
        //TODO 自己实现
        return null;
    }
    
    public IPage<DiscardOrderManageVo> discardOrderPage(OrderPageManageDto orderPageManageDto) {
        //TODO 自己实现
        return null;
    }
}
