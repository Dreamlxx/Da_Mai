package com.damai.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.AreaGetDto;
import com.damai.dto.AreaSelectDto;
import com.damai.entity.Area;
import com.damai.mapper.AreaMapper;
import com.damai.vo.AreaVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 地区 service
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class AreaService extends ServiceImpl<AreaMapper, Area> {
    
    @Autowired
    private AreaMapper areaMapper;
    
    
    public List<AreaVo> selectCityData() {
        //TODO 自己实现
        return null;
    }
    
    public List<AreaVo> selectByIdList(AreaSelectDto areaSelectDto) {
        //TODO 自己实现
        return null;
    }
    
    public AreaVo getById(AreaGetDto areaGetDto) {
        //TODO 自己实现
        return null;
    }
    
    public AreaVo current() {
        //TODO 自己实现
        return null;
    }
    
    public List<AreaVo> manageList(){
        //TODO 自己实现
        return null;
    }
    
    public List<AreaVo> hot() {
        //TODO 自己实现
        return null;
    }
}
