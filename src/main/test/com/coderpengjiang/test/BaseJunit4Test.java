package com.coderpengjiang.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: ssm
 * @description: 基于junit4的测试
 * @author: CoderPengJiang
 * @create: 2019-10-23 21:46
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BaseJunit4Test {

}
