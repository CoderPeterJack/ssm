package com.coderpengjiang.controller;

import com.coderpengjiang.model.CpjUser;
import com.coderpengjiang.service.CpjUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: ssm
 * @description:控制层类
 * @author: CoderPengJiang
 * @create: 2019-10-22 19:12
 **/
@Controller
@RequestMapping(value = "/user")
public class CpjUserController {
    @Resource
    private CpjUserService cpjUserService;

    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<CpjUser> cpjUserList = cpjUserService.findAll();
        for (CpjUser cpjUser : cpjUserList) {
            System.out.println("id:" + cpjUser.getId());
            System.out.println("name:" + cpjUser.getName());
        }
        return "hello";
    }
}