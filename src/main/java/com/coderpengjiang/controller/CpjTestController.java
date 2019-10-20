package com.coderpengjiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ssm
 * @description:
 * @author: CoderPengJiang
 * @create: 2019-10-20 11:21
 **/
@Controller
@RequestMapping("/test")
public class CpjTestController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "hello";
    }
}
