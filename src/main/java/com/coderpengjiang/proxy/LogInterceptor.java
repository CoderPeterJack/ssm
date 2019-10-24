package com.coderpengjiang.proxy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @program: ssm
 * @description: 日志拦截类（切面）
 * @author: CoderPengJiang
 * @create: 2019-10-24 23:10
 **/
@Aspect
@Component
public class LogInterceptor {
    @Before(value="execution(* com.coderpengjiang.controller.*.*(..)))")
    public void before(){
        System.out.println("进入方法的时间为："+System.currentTimeMillis());
    }
    @After(value = "execution(* com.coderpengjiang.controller.*.*(..))")
    public void after(){
        System.out.println("退出方法的时间为："+System.currentTimeMillis());
    }
}
