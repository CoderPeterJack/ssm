package com.coderpengjiang.dao;

import com.coderpengjiang.model.CpjUser;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: ssm
 * @description: 用查询等用户数据
 * @author: CoderPengJiang
 * @create: 2019-10-21 23:35
 **/
@Repository
public interface CpjUserDao {
    List<CpjUser> findAll();

}
