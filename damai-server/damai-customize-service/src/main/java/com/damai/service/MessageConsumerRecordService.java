package com.damai.service;


import com.baidu.fsg.uid.UidGenerator;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.InsertMessageConsumerRecordDto;
import com.damai.dto.MessageIdDto;
import com.damai.dto.UpdateMessageConsumerRecordDto;
import com.damai.entity.MessageConsumerRecord;
import com.damai.mapper.MessageConsumerRecordMapper;
import com.damai.vo.MessageConsumerRecordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 消息消费服务实现层
 * @author: 阿星不是程序员
 **/
@Service
public class MessageConsumerRecordService extends ServiceImpl<MessageConsumerRecordMapper, MessageConsumerRecord> {
    
    @Autowired
    private UidGenerator uidGenerator;
    
    @Autowired
    private MessageConsumerRecordMapper messageConsumerRecordMapper;
    
    
    @Transactional(rollbackFor = Exception.class)
    public MessageConsumerRecordVo insertMessageConsumerRecord(InsertMessageConsumerRecordDto insertMessageConsumerRecordDto){
        //TODO 自己实现
        return null;
    }
    
    
    public MessageConsumerRecordVo getByMessageId(MessageIdDto messageIdDto) {
        //TODO 自己实现
        return null;
    }
    
    public Boolean updateMessageConsumerRecord(UpdateMessageConsumerRecordDto updateMessageConsumerRecordDto) {
        //TODO 自己实现
        return null;
    }
}
