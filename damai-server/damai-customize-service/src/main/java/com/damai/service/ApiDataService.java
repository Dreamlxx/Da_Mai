package com.damai.service;

import com.baidu.fsg.uid.UidGenerator;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.AddApiDataDto;
import com.damai.dto.ApiDataDto;
import com.damai.entity.ApiData;
import com.damai.mapper.ApiDataMapper;
import com.damai.vo.ApiDataVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: api调用记录 service
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class ApiDataService extends ServiceImpl<ApiDataMapper,ApiData> {

    @Autowired
    private ApiDataMapper apiDataMapper;
    
    @Autowired
    private UidGenerator uidGenerator;
    
    
    public Page<ApiDataVo> pageList(final ApiDataDto dto) {
        //TODO 自己实现
        return null;
    }
    
    public Boolean add(final AddApiDataDto dto) {
        //TODO 自己实现
        return null;
    }
}
