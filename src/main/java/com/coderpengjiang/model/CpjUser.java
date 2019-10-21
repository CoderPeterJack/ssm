package com.coderpengjiang.model;

import java.io.Serializable;

/**
 * @program: ssm
 * @description: 用户实体
 * @author: CoderPengJiang
 * @create: 2019-10-21 23:31
 **/
public class CpjUser implements Serializable {
    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
