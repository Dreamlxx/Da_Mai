package com.damai.service;


import com.baidu.fsg.uid.UidGenerator;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.InsertMessageProducerRecordDto;
import com.damai.dto.UpdateMessageProducerRecordDto;
import com.damai.entity.MessageConsumerRecord;
import com.damai.entity.MessageProducerRecord;
import com.damai.mapper.MessageConsumerRecordMapper;
import com.damai.mapper.MessageProducerRecordMapper;
import com.damai.vo.MessageProducerRecordVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 消息发送服务实现层
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class MessageProducerRecordService extends ServiceImpl<MessageProducerRecordMapper, MessageProducerRecord> {
    
    @Autowired
    private UidGenerator uidGenerator;
    
    @Autowired
    private MessageProducerRecordMapper messageProducerRecordMapper;
    
    @Autowired
    private MessageConsumerRecordMapper messageConsumerRecordMapper;
    
    
    
    @Transactional(rollbackFor = Exception.class)
    public MessageProducerRecordVo insertMessageProducerRecord(InsertMessageProducerRecordDto insertMessageProducerRecordDto){
        //TODO 自己实现
        return null;
    }
    
    public Boolean updateMessageProducerRecord(UpdateMessageProducerRecordDto updateMessageProducerRecordDto) {
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public void updateToReconciliationSuccess(MessageProducerRecord oldMessageProducerRecord, MessageConsumerRecord oldMessageConsumerRecord){
        //TODO 自己实现
    }
}
