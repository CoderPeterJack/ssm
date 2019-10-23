package com.coderpengjiang.service.impl;

import com.coderpengjiang.dao.CpjUserDao;
import com.coderpengjiang.model.CpjUser;
import com.coderpengjiang.service.CpjUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: ssm
 * @description: 继承CpjUserDao接口
 * @author: CoderPengJiang
 * @create: 2019-10-22 19:03
 **/
@Service
public class CpjUserServiceImpl implements CpjUserService {
    @Resource
    private CpjUserDao cpjUserDao;
    public List<CpjUser> findAll(){
        return cpjUserDao.findAll();
    }
}
