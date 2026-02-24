package com.damai.service;

import com.damai.domain.ProgramRecord;
import com.damai.domain.ReconciliationTaskData;
import com.damai.entity.OrderProgram;
import com.damai.entity.OrderTicketUserRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 订单任务
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class OrderTaskService {
    
    public ReconciliationTaskData reconciliationTask(Long programId) {
        //TODO 自己实现
        return null;
    }
    
    private Map<String, List<ProgramRecord>> findNeedCompensationRecords(List<OrderProgram> orderPrograms, Map<String, String> redisRecordMap) {
        //TODO 自己实现
        return null;
    }
    
    private Map<String, ProgramRecord> compensateAndFinalize(Long programId, 
                                                              Map<String, List<ProgramRecord>> needToRedisRecordMap,
                                                              Map<String, String> redisRecordMap) {
        //TODO 自己实现
        return null;
    }
    
    
    private List<ProgramRecord> buildProgramRecordsForUser(List<OrderTicketUserRecord> userRecords, Map<String, String> redisRecordMap) {
        //TODO 自己实现
        return null;
    }
    
    private List<OrderTicketUserRecord> findMissingInRedis(
            List<OrderTicketUserRecord> dbRecords, Map<String, String> redisRecordMap, String recordType) {
        //TODO 自己实现
        return null;
    }
}
