package com.damai.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.ParentProgramCategoryDto;
import com.damai.dto.ProgramCategoryDto;
import com.damai.entity.ProgramCategory;
import com.damai.mapper.ProgramCategoryMapper;
import com.damai.vo.ProgramCategoryVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 节目类型 service
 * @author: 阿星不是程序员
 **/
@Service
public class ProgramCategoryService extends ServiceImpl<ProgramCategoryMapper, ProgramCategory> {
    
    
    /**
     * 查询所有节目类型
     * */
    public List<ProgramCategoryVo> selectAll(){
        //TODO 自己实现
        return null;
    }
            
    public List<ProgramCategoryVo> selectByType(ProgramCategoryDto programCategoryDto) {
        //TODO 自己实现
        return null;
    }
    
    public List<ProgramCategoryVo> selectByParentProgramCategoryId(ParentProgramCategoryDto parentProgramCategoryDto) {
        //TODO 自己实现
        return null;
    }
}
