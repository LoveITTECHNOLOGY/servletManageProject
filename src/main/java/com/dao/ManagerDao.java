package com.dao;

import com.entity.Emp;
import com.entity.Manager;

public interface ManagerDao {
    //定义一个查询用户名的方法用于登录
    public Manager select(String username);
    //增加1管理员信息
    public int insert(Manager manager);
}
