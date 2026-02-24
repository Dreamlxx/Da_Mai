package com.damai.filter;

import com.damai.util.StringUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

import static com.damai.constant.Constant.CODE;
import static com.damai.constant.Constant.GRAY_PARAMETER;
import static com.damai.constant.Constant.TRACE_ID;
import static com.damai.constant.Constant.USER_ID;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 业务服务过滤器
 * @author: 阿星不是程序员
 **/
@Slf4j
public class BaseParameterFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response, final FilterChain filterChain) throws ServletException, IOException {
        ServletInputStream sis = request.getInputStream();
        String requestBody  = StringUtil.inputStreamConvertString(sis);
        if (StringUtil.isNotEmpty(requestBody)) {
            requestBody = requestBody.replaceAll(" ", "").replaceAll("\r\n","");
        }
        String traceId = request.getHeader(TRACE_ID);
        String gray = request.getHeader(GRAY_PARAMETER);
        String userId = request.getHeader(USER_ID);
        String code = request.getHeader(CODE);
        
        try {
            //TODO 自己实现
            filterChain.doFilter(request, response);
        }finally {
            //TODO 自己实现
        }
    }
}
