package com.damai.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.ProgramShowTimeAddDto;
import com.damai.entity.ProgramShowTime;
import com.damai.mapper.ProgramShowTimeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 节目演出时间 service
 * @author: 阿星不是程序员
 **/
@Service
public class ProgramShowTimeService extends ServiceImpl<ProgramShowTimeMapper, ProgramShowTime> {
    
    @Transactional(rollbackFor = Exception.class)
    public Long add(ProgramShowTimeAddDto programShowTimeAddDto) {
        //TODO 自己实现
        return null;
    }
}
