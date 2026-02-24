package com.damai.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.damai.dto.ExecuteExceptionMessageDto;
import com.damai.dto.MessageRecordDto;
import com.damai.mapper.MessageConsumerRecordMapper;
import com.damai.mapper.MessageProducerRecordMapper;
import com.damai.vo.MessageRecordVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 消息记录实现层
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class MessageRecordService {
    
    @Autowired
    private MessageProducerRecordMapper messageProducerRecordMapper;
    
    @Autowired
    private MessageConsumerRecordMapper messageConsumerRecordMapper;
    
    
    @Autowired
    private MessageProducerRecordService messageProducerRecordService;
    
    
    public IPage<MessageRecordVo> page(MessageRecordDto messageRecordDto) {
        //TODO 自己实现
        return null;
    }
    
    public Boolean executeExceptionMessage(ExecuteExceptionMessageDto executeExceptionMessageDto) {
        //TODO 自己实现
        return null;
    }
    
    public Boolean executeReconciliationTask() {
        //TODO 自己实现
        return null;
    }
}
