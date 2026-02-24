package com.damai.controller;

import com.damai.common.ApiResponse;
import com.damai.service.ShardingMigrationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 订单数据迁移 控制层
 * @author: 阿星不是程序员
 **/
@RestController
@RequestMapping("/order/data")
@Tag(name = "order/data", description = "订单数据迁移")
public class OrderDataController {
    
    @Autowired
    private ShardingMigrationService shardingMigrationService;

    @Operation(summary = "分库分表扩容迁移（基因法方案1）")
    @PostMapping(value = "/sharding/migrate")
    public ApiResponse<Map<String, Object>> shardingMigrate() {
        //TODO 自己实现
        return ApiResponse.ok();
    }
}