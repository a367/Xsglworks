package com.fire.util.logaop;

import com.fire.util.DateSourceUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAsp {

    @Pointcut("execution(public * com.fire.service.oracle..*(..))")
    public void oracleCut(){
        // 系统中需要配置oracle数据源的切面
    }

    @Before("oracleCut()")
    @Order(10)
    public void dataAround(){
        DateSourceUtils.setDataSourceKey("oracle");
    }

}
