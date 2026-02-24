package com.damai.service;

import com.baidu.fsg.uid.UidGenerator;
import com.damai.dto.NotifyDto;
import com.damai.dto.PayBillDto;
import com.damai.dto.PayDto;
import com.damai.dto.RefundDto;
import com.damai.dto.TradeCheckDto;
import com.damai.mapper.PayBillMapper;
import com.damai.mapper.RefundBillMapper;
import com.damai.pay.PayStrategyContext;
import com.damai.vo.NotifyVo;
import com.damai.vo.PayBillVo;
import com.damai.vo.TradeCheckVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 支付 service
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class PayService {
    
    @Autowired
    private PayBillMapper payBillMapper;
    
    @Autowired
    private RefundBillMapper refundBillMapper;
    
    @Autowired
    private PayStrategyContext payStrategyContext;
    
    @Autowired
    private UidGenerator uidGenerator;
    
   
    public String commonPay(PayDto payDto) {
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public NotifyVo notify(NotifyDto notifyDto){
        //TODO 自己实现
        return null;
    }
    
    public TradeCheckVo tradeCheck(TradeCheckDto tradeCheckDto) {
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public String refund(RefundDto refundDto) {
        //TODO 自己实现
        return null;
    }
    
    public PayBillVo detail(PayBillDto payBillDto) {
        //TODO 自己实现
        return null;
    }
}
