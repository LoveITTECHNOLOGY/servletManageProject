package com.service.impl;

import com.dao.ManagerDao;
import com.dao.impl.ManagerDaoImpl;
import com.entity.Manager;
import com.service.ManagerService;
import com.utils.DbUtils;

import javax.xml.crypto.Data;

public class ManagerServiceImpl  implements ManagerService {
    //调用业务逻辑
    public ManagerDao managerDao=new ManagerDaoImpl();
    @Override
    public Manager login(String username, String password) {
        Manager result=null;
        //已知用户名
        Manager manager=managerDao.select(username);
        try {
            DbUtils.begin();
            //如果manager不为空
            if(manager!=null){
                result=manager;
            }
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int managerRegister_show(Manager manager) {
        int register_show=0;
        try {
            DbUtils.begin();
            register_show=managerDao.insert(manager);
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return register_show;
    }
}
