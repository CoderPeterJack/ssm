package com.coderpengjiang.test;

import java.lang.reflect.Method;

/**
 * @program: ssm
 * @description: 日志实现类
 * @author: CoderPengJiang
 * @create: 2019-10-24 22:30
 **/
public class MyLoggerImpl implements MyLogger{
    /**
     * @Description: 记录进入方法的时间
     * @Param: [method]
     * @return: void
     * @Author: Mr.Jiang
     * @Date: 2019/10/24
     */
    public void saveIntoMethodTime(Method method) {
        System.out.println("进入" + method.getName() + "方法的时间为：" + System.currentTimeMillis());
    }

    /**
     * @Description: 记录退出方法的时间
     * @Param: [method]
     * @return: void
     * @Author: Mr.Jiang
     * @Date: 2019/10/24
     */
    public void saveOutMethodTime(Method method) {
        System.out.println("退出" + method.getName() + "方法时间为：" + System.currentTimeMillis());
    }
}
