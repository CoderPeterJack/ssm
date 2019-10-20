package com.coderpengjiang.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @program: ssm
 * @description:该类为服务层次，测试所用
 * @author: CoderPengJiang
 * @create: 2019-10-20 10:32
 **/
@Service
public class SpringTest {
    @Test
    public void testSpring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取SpringTest类
        SpringTest springTest=(SpringTest) applicationContext.getBean("springTest");
        //调用sayHello方法
        springTest.sayHello();
    }
    public void sayHello(){
        System.out.println("hello coderpengjiang");
    }
}
