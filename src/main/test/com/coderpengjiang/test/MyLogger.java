package com.coderpengjiang.test;

import java.lang.reflect.Method;

/**
 * 日志类接口
 */
public interface MyLogger {
    /**
    * @Description: 记录进入方法的时间
    * @Param: [method]
    * @return: void
    * @Author: Mr.Jiang
    * @Date: 2019/10/24
    */
    void saveIntoMethodTime(Method method);
    /**
    * @Description: 记录推出方法的时间
    * @Param: [method]
    * @return: void
    * @Author: Mr.Jiang
    * @Date: 2019/10/24
    */
    void saveOutMethodTime(Method method);
}
