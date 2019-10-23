//package com.coderpengjiang.controller;
//
//import com.coderpengjiang.model.CpjUser;
//import com.coderpengjiang.service.CpjUserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * @program: ssm
// * @description:
// * @author: CoderPengJiang
// * @create: 2019-10-20 11:21
// **/
//@Controller
//@RequestMapping(value = "/test")
//public class CpjTestController {
//    @Resource
//    private CpjUserService cpjUserService;
//    @RequestMapping("/hello")
//    public String hello(){
//        List<CpjUser> cpjUserList=cpjUserService.findAll();
//        System.out.println("hello jiang");
//        return "hello";
//    }
//}
//