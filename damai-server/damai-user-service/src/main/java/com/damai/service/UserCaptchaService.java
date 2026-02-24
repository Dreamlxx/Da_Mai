package com.damai.service;

import com.damai.captcha.model.common.ResponseModel;
import com.damai.captcha.model.vo.CaptchaVO;
import com.damai.vo.CheckNeedCaptchaDataVo;
import org.springframework.stereotype.Service;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 判断是否需要验证码
 * @author: 阿星不是程序员
 **/
@Service
public class UserCaptchaService {
    
    
    public CheckNeedCaptchaDataVo checkNeedCaptcha() {
        //TODO 自己实现
        return null;
    }
    
    public ResponseModel getCaptcha(CaptchaVO captchaVO) {
        //TODO 自己实现
        return null;
    }
    
    public ResponseModel verifyCaptcha(final CaptchaVO captchaVO) {
        //TODO 自己实现
        return null;
    }
}
