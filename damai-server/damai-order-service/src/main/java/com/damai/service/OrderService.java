package com.damai.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.domain.OrderCreateDomain;
import com.damai.domain.OrderCreateMq;
import com.damai.dto.AccountOrderCountDto;
import com.damai.dto.OrderCancelDto;
import com.damai.dto.OrderCreateDto;
import com.damai.dto.OrderGetDto;
import com.damai.dto.OrderListDto;
import com.damai.dto.OrderPayCheckDto;
import com.damai.dto.OrderPayDto;
import com.damai.dto.OrderSimpleListDto;
import com.damai.entity.Order;
import com.damai.mapper.OrderMapper;
import com.damai.vo.AccountOrderCountVo;
import com.damai.vo.OrderGetVo;
import com.damai.vo.OrderListVo;
import com.damai.vo.OrderPayCheckVo;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 订单 service
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class OrderService extends ServiceImpl<OrderMapper, Order> {
    

    @Transactional(rollbackFor = Exception.class)
    public String create(OrderCreateDto orderCreateDto) {
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public String createByMq(OrderCreateMq orderCreateMq) {
        //TODO 自己实现
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public String doCreate(OrderCreateDomain orderCreateDomain) {
        //TODO 自己实现
        return null;
    }
    
    /**
     * 订单取消，以订单编号加锁
     * */
    @Transactional(rollbackFor = Exception.class)
    public boolean cancel(OrderCancelDto orderCancelDto){
        //TODO 自己实现
        return false;
    }
    
    public String pay(OrderPayDto orderPayDto) {
        //TODO 自己实现
        return null;
    }
    
    
    /**
     * 支付后订单检查，以订单编号加锁，防止多次更新
     * */
    public OrderPayCheckVo payCheck(OrderPayCheckDto orderPayCheckDto){
        //TODO 自己实现
        return null;
    }
    
    
    public String alipayNotify(HttpServletRequest request){
        //TODO 自己实现
        return null;
    }
    
    
    public List<OrderListVo> selectList(OrderListDto orderListDto) {
        //TODO 自己实现
        return null;
    }
    
    public OrderGetVo get(OrderGetDto orderGetDto) {
        //TODO 自己实现
        return null;
    }
    
    public AccountOrderCountVo accountOrderCount(AccountOrderCountDto accountOrderCountDto) {
        //TODO 自己实现
        return null;
    }
    
    
    public String getCache(OrderGetDto orderGetDto) {
        //TODO 自己实现
        return null;
    }
    @Transactional(rollbackFor = Exception.class)
    public boolean initiateCancel(OrderCancelDto orderCancelDto){
        //TODO 自己实现
        return false;
    }
    
    
    public void delOrderAndOrderTicketUser(){
        //TODO 自己实现
    }
    
    public List<OrderListVo> simpleList(OrderSimpleListDto orderSimpleListDto) {
        //TODO 自己实现
        return null;
    }
}
