package com.service;

import com.entity.Manager;

public interface ManagerService {
    //login
    public Manager login(String username,String password);
    //管理员注册显示
    public int managerRegister_show(Manager manager);
}
