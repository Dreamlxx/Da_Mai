package com.damai.filter.impl;


import com.damai.context.ContextHandler;
import com.damai.filter.AbstractServerFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.damai.constant.Constant.GRAY_FLAG_FALSE;
import static com.damai.constant.Constant.GRAY_FLAG_TRUE;
import static com.damai.constant.Constant.SERVER_GRAY;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 灰度过滤器
 * @author: 阿星不是程序员
 **/

@Slf4j
public class ServerGrayFilter extends AbstractServerFilter {
    
    /**
     * 此服务的灰度标识
     * */
    @Value(SERVER_GRAY)
    private String serverGray;
    
    private final ContextHandler contextHandler;
    
    private final Map<String,String> map = new HashMap<>();
    
    public ServerGrayFilter(ContextHandler contextHandler){
        this.contextHandler = contextHandler;
        this.map.put(GRAY_FLAG_FALSE, GRAY_FLAG_FALSE);
        this.map.put(GRAY_FLAG_TRUE, GRAY_FLAG_TRUE);
    }
    

    @Override
    public boolean doFilter(List<? extends ServiceInstance> servers, ServiceInstance server) {
        //TODO 自己实现
        return true;
    }

    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }
}