package com.coderpengjiang.service;

import com.coderpengjiang.model.CpjUser;

import java.util.List;

/**
 * @program: ssm
 * @description: 对应的服务层
 * @author: CoderPengJiang
 * @create: 2019-10-21 23:39
 **/
public interface CpjUserService {
    List<CpjUser> findAll();
}
