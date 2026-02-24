package com.damai.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.ProgramRecordTaskAddDto;
import com.damai.dto.ProgramRecordTaskListDto;
import com.damai.dto.ProgramRecordTaskUpdateDto;
import com.damai.entity.ProgramRecordTask;
import com.damai.mapper.ProgramRecordTaskMapper;
import com.damai.vo.ProgramRecordTaskVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 节目演出时间 service
 * @author: 阿星不是程序员
 **/
@Service
public class ProgramRecordTaskService extends ServiceImpl<ProgramRecordTaskMapper, ProgramRecordTask> {
    
    
    public List<ProgramRecordTaskVo> select(ProgramRecordTaskListDto programRecordTaskListDto){
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public Integer updateByCreateTime(ProgramRecordTaskUpdateDto programRecordTaskUpdateDto){
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public Integer add(ProgramRecordTaskAddDto orderTicketUserRecordAddDto){
        //TODO 自己实现
        return null;
    }
}
