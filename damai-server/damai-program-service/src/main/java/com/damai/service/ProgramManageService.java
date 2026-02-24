package com.damai.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.damai.dto.ProgramManageDto;
import com.damai.dto.SeatPageManageDto;
import com.damai.vo.SeatManageVo;
import com.damai.vo.TicketCategoryDbManageVo;
import com.damai.vo.TicketCategoryDetailManageVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 节目后台管理 service
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class ProgramManageService  {
    
    
    public List<TicketCategoryDetailManageVo> ticketCategoryList(ProgramManageDto programManageDto) {
        //TODO 自己实现
        return null;
    }
    
    public List<TicketCategoryDbManageVo> dbTicketCategoryList(ProgramManageDto programManageDto) {
        //TODO 自己实现
        return null;
    }
    
    public IPage<SeatManageVo> seatPage(SeatPageManageDto seatPageManageDto) {
        //TODO 自己实现
        return null;
    }
}
