package com.coderpengjiang.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: ssm
 * @description: 日志类Handler
 * @author: CoderPengJiang
 * @create: 2019-10-24 22:37
 **/
public class MyLoggerHandler implements InvocationHandler {
    //原始对象
    private Object objOriginal;
    //这里很关键
    private MyLogger myLogger= new MyLoggerImpl();
    public MyLoggerHandler(Object obj){
        super();
        this.objOriginal=obj;
    }

    public Object invoke(Object proxy, Method method,Object[] args) throws Throwable{
        Object result=null;
        //日志类的方法：保存进入方法的时间
        myLogger.saveIntoMethodTime(method);
        //调用代理类方法
        result=method.invoke(this.objOriginal,args);
        //日志类的方法：保持退出方法的时间
        myLogger.saveIntoMethodTime(method);
        return result;
    }
}
