package com.damai.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.skywalking.apm.toolkit.trace.TraceContext;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class SkyWalkingFilter extends OncePerRequestFilter {
    
    
    @Override
    protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response, final FilterChain filterChain) throws ServletException, IOException {
        String skyWalkingTraceId = TraceContext.traceId();
        
        try {
            //TODO 自己实现
            filterChain.doFilter(request, response);
        }finally {
            //TODO 自己实现
        }
    }
}