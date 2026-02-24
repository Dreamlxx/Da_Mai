package com.damai.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.TicketCategoryAddDto;
import com.damai.dto.TicketCategoryDto;
import com.damai.dto.TicketCategoryListByProgramDto;
import com.damai.dto.TicketCategoryListDto;
import com.damai.entity.TicketCategory;
import com.damai.mapper.TicketCategoryMapper;
import com.damai.vo.TicketCategoryDetailVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 票档 service
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class TicketCategoryService extends ServiceImpl<TicketCategoryMapper, TicketCategory> {
    
    @Transactional(rollbackFor = Exception.class)
    public Long add(TicketCategoryAddDto ticketCategoryAddDto) {
        //TODO 自己实现
        return null;
    }
    
    public TicketCategoryDetailVo detail(TicketCategoryDto ticketCategoryDto) {
        //TODO 自己实现
        return null;
    }

    public List<TicketCategoryDetailVo> selectList(TicketCategoryListDto ticketCategoryDto) {
        //TODO 自己实现
        return null;
    }

    public List<TicketCategoryDetailVo> selectListByProgram(TicketCategoryListByProgramDto ticketCategoryListByProgramDto) {
        //TODO 自己实现
        return null;
    }
}
