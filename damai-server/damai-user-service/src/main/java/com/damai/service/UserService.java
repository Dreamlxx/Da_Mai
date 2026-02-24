package com.damai.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.damai.dto.UserAuthenticationDto;
import com.damai.dto.UserExistDto;
import com.damai.dto.UserGetAndTicketUserListDto;
import com.damai.dto.UserIdDto;
import com.damai.dto.UserLoginDto;
import com.damai.dto.UserLogoutDto;
import com.damai.dto.UserMobileDto;
import com.damai.dto.UserRegisterDto;
import com.damai.dto.UserUpdateDto;
import com.damai.dto.UserUpdateEmailDto;
import com.damai.dto.UserUpdateMobileDto;
import com.damai.dto.UserUpdatePasswordDto;
import com.damai.entity.User;
import com.damai.mapper.UserMapper;
import com.damai.vo.UserGetAndTicketUserListVo;
import com.damai.vo.UserLoginVo;
import com.damai.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 用户 service
 * @author: 阿星不是程序员
 **/
@Slf4j
@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    
    
    public Boolean register(UserRegisterDto userRegisterDto) {
        //TODO 自己实现
        return null;
    }
    
    public void exist(UserExistDto userExistDto){
        doExist(userExistDto.getMobile());
    }
    
    public void doExist(String mobile){
        //TODO 自己实现
    }
    
    /**
     * 登录
     * @param userLoginDto 登录入参
     * @return 用户信息
     * */
    public UserLoginVo login(UserLoginDto userLoginDto) {
        //TODO 自己实现
        return null;
    }
    
    public Boolean logout(UserLogoutDto userLogoutDto) {
        //TODO 自己实现
        return null;
    }
    
    
    @Transactional(rollbackFor = Exception.class)
    public void update(UserUpdateDto userUpdateDto){
        //TODO 自己实现
    }
    @Transactional(rollbackFor = Exception.class)
    public void updatePassword(UserUpdatePasswordDto userUpdatePasswordDto){
        //TODO 自己实现
    }
    @Transactional(rollbackFor = Exception.class)
    public void updateEmail(UserUpdateEmailDto userUpdateEmailDto){
        //TODO 自己实现
    }
    
    @Transactional(rollbackFor = Exception.class)
    public void updateMobile(UserUpdateMobileDto userUpdateMobileDto){
        //TODO 自己实现
    }
    
    @Transactional(rollbackFor = Exception.class)
    public void authentication(UserAuthenticationDto userAuthenticationDto){
        //TODO 自己实现
    }
    
    public UserVo getByMobile(UserMobileDto userMobileDto) {
        //TODO 自己实现
        return null;
    }
    
    public UserVo getById(UserIdDto userIdDto) {
        //TODO 自己实现
        return null;
    }
    
    public UserGetAndTicketUserListVo getUserAndTicketUserList(final UserGetAndTicketUserListDto userGetAndTicketUserListDto) {
        //TODO 自己实现
        return null;
    }
}
