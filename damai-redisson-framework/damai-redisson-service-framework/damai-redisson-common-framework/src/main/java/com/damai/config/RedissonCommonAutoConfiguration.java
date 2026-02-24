package com.damai.config;

import org.redisson.spring.starter.RedissonAutoConfiguration;
import org.redisson.spring.starter.RedissonAutoConfigurationV2;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: redisson通用配置
 * @author: 阿星不是程序员
 **/
@AutoConfigureBefore(value = {RedissonAutoConfigurationV2.class, RedissonAutoConfiguration.class})
@EnableConfigurationProperties(RedissonBaseProperties.class)
public class RedissonCommonAutoConfiguration {
    
    //TODO 自己实现
}
