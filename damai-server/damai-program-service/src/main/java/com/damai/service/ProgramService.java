package com.damai.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.ProgramAddDto;
import com.damai.dto.ProgramDataPreheatDto;
import com.damai.dto.ProgramGetDto;
import com.damai.dto.ProgramInvalidDto;
import com.damai.dto.ProgramListDto;
import com.damai.dto.ProgramOperateDataDto;
import com.damai.dto.ProgramPageListDto;
import com.damai.dto.ProgramRecommendListDto;
import com.damai.dto.ProgramResetExecuteDto;
import com.damai.dto.ProgramSearchDto;
import com.damai.dto.ReduceRemainNumberDto;
import com.damai.entity.Program;
import com.damai.mapper.ProgramMapper;
import com.damai.page.PageVo;
import com.damai.vo.ProgramHomeVo;
import com.damai.vo.ProgramListVo;
import com.damai.vo.ProgramVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 节目 service
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class ProgramService extends ServiceImpl<ProgramMapper, Program> {
    
    
    /**
     * 添加节目
     * @param programAddDto 添加节目数据的入参
     * @return 添加节目后的id
     * */
    public Long add(ProgramAddDto programAddDto){
        //TODO 自己实现
        return null;
    }
    
    /**
     * 搜索
     * @param programSearchDto 搜索节目数据的入参
     * @return 执行后的结果
     * */
    public PageVo<ProgramListVo> search(ProgramSearchDto programSearchDto) {
        //TODO 自己实现
        return null;
    }
    
    /**
     * 查询主页信息
     * @param programListDto 查询节目数据的入参
     * @return 执行后的结果
     * */
    public List<ProgramHomeVo> selectHomeList(ProgramListDto programListDto) {
        //TODO 自己实现
        return null;
    }
    
    
    /**
     * 查询分类列表（数据库查询）
     * @param programPageListDto 查询节目数据的入参
     * @return 执行后的结果
     * */
    public PageVo<ProgramListVo> selectPage(ProgramPageListDto programPageListDto) {
        //TODO 自己实现
        return null;
    }
    
    /**
     * 推荐列表
     * @param programRecommendListDto 查询节目数据的入参
     * @return 执行后的结果
     * */
    public List<ProgramListVo> recommendList(ProgramRecommendListDto programRecommendListDto){
        //TODO 自己实现
        return null;
    }
    
    /**
     * 查询节目详情
     * @param programGetDto 查询节目数据的入参
     * @return 执行后的结果
     * */
    public ProgramVo detail(ProgramGetDto programGetDto) {
        //TODO 自己实现
        return null;
    }
    
    /**
     * 查询节目详情V1
     * @param programGetDto 查询节目数据的入参
     * @return 执行后的结果
     * */
    public ProgramVo detailV1(ProgramGetDto programGetDto) {
        //TODO 自己实现
        return null;
    }
    
    /**
     * 查询节目详情V2
     * @param programGetDto 查询节目数据的入参
     * @return 执行后的结果
     * */
    public ProgramVo detailV2(ProgramGetDto programGetDto) {
        //TODO 自己实现
        return null;
    }
    
    public Boolean operateSeatLockAndTicketCategoryRemainNumber(ReduceRemainNumberDto reduceRemainNumberDto){
        //TODO 自己实现
        return null;
    }
    
    public Boolean operateProgramData(ProgramOperateDataDto programOperateDataDto){
        //TODO 自己实现
        return null;
    }
    
    
    public List<Long> getAllProgramIdList(){
        //TODO 自己实现
        return null;
    }
    
    @Transactional(rollbackFor = Exception.class)
    public Boolean resetExecute(ProgramResetExecuteDto programResetExecuteDto) {
        //TODO 自己实现
        return null;
    }
    
    public Boolean invalid(final ProgramInvalidDto programInvalidDto) {
        //TODO 自己实现
        return null;
    }
    
    public ProgramVo localDetail(final ProgramGetDto programGetDto) {
        //TODO 自己实现
        return null;
    }
    
    public Boolean dataPreheat(ProgramDataPreheatDto programDataPreheatDto){
        //TODO 自己实现
        return null;
    }
}

