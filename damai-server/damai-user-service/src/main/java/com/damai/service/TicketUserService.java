package com.damai.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.TicketUserDto;
import com.damai.dto.TicketUserIdDto;
import com.damai.dto.TicketUserListDto;
import com.damai.entity.TicketUser;
import com.damai.mapper.TicketUserMapper;
import com.damai.vo.TicketUserVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 购票人 service
 * @author: 阿星不是程序员
 **/
@Service
public class TicketUserService extends ServiceImpl<TicketUserMapper, TicketUser> {
    
    public List<TicketUserVo> list(TicketUserListDto ticketUserListDto) {
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public void add(TicketUserDto ticketUserDto) {
        //TODO 自己实现
    }
    @Transactional(rollbackFor = Exception.class)
    public void delete(TicketUserIdDto ticketUserIdDto) {
        //TODO 自己实现
    }
}
