package com.coderpengjiang.test;

import java.lang.reflect.Proxy;

/**
 * @program: ssm
 * @description: 测试类
 * @author: CoderPengJiang
 * @create: 2019-10-24 22:50
 **/
public class MyLoggerTest {
    public static void main(String[] args) {
        //实例化真实项目中的业务类
        BusinessClassService businessClassService = new BusinessClassServiceImpl();
        //日志类的handler
        MyLoggerHandler myLoggerHandler = new MyLoggerHandler(businessClassService);
        //获得代理类的对象
        BusinessClassService businessClass = (BusinessClassService) Proxy.newProxyInstance(businessClassService.getClass().getClassLoader(),
                businessClassService.getClass().getInterfaces(), myLoggerHandler);
        //执行代理方法
        businessClass.doSomeThing();
    }
}
