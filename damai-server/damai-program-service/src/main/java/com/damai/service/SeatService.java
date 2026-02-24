package com.damai.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.SeatAddDto;
import com.damai.dto.SeatBatchAddDto;
import com.damai.dto.SeatListDto;
import com.damai.entity.Seat;
import com.damai.mapper.SeatMapper;
import com.damai.vo.SeatRelateInfoVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 座位 service
 * @author: 阿星不是程序员
 **/
@Service
public class SeatService extends ServiceImpl<SeatMapper, Seat> {
    
    /**
     * 添加座位
     * */
    public Long add(SeatAddDto seatAddDto) {
        //TODO 自己实现
        return null;
    }
    
    public SeatRelateInfoVo relateInfo(SeatListDto seatListDto) {
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public Boolean batchAdd(SeatBatchAddDto seatBatchAddDto) {
        //TODO 自己实现
        return null;
    }
}
