package com.damai.service;

import com.baidu.fsg.uid.UidGenerator;
import com.damai.client.ApiDataClient;
import com.damai.dto.ChannelDataAddDto;
import com.damai.dto.GetChannelDataByCodeDto;
import com.damai.mapper.ChannelDataMapper;
import com.damai.vo.GetChannelDataVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 渠道 service
 * @author: 阿星不是程序员
 **/
@Service
@Slf4j
public class ChannelDataService {
    
    @Autowired
    private ChannelDataMapper channelDataMapper;
    
    @Autowired
    private UidGenerator uidGenerator;
    
    
    @Autowired
    private ApiDataClient apiDataClient;
    
    public GetChannelDataVo getByCode(GetChannelDataByCodeDto dto){
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public void add(ChannelDataAddDto channelDataAddDto) {
        //TODO 自己实现
    }
}
