package com.service.impl;

import com.dao.EmpDao;
import com.dao.impl.EmpDaoImpl;
import com.entity.Emp;
import com.service.EmpService;
import com.utils.DbUtils;

import java.util.List;

public class EmpServiceImpl  implements EmpService {
    //调用员工逻辑
    public EmpDao empDao=new EmpDaoImpl();
    @Override
    public List<Emp> showAllEmpInfo() {
        List<Emp> empList=null;
        try {
            DbUtils.begin();
            empList=empDao.selectAll();
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return empList;
    }

    @Override
    public int removeId(int id) {
        int remove=0;
        try {
            DbUtils.begin();
            remove=empDao.delete(id);
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return remove;
    }

    @Override
    public Emp showId(int id) {
        Emp show=null;
        try {
            DbUtils.begin();
            show=empDao.select(id);
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return show;
    }

    @Override
    public int showUpdateEmp(Emp emp) {
        int showUpdate=0;
        try {
            DbUtils.begin();
            showUpdate=empDao.update(emp);
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return showUpdate;
    }

    @Override
    public int showInsertEmp(Emp emp) {
        int insert=0;
        try {
            DbUtils.begin();
            insert=empDao.insert(emp);
            DbUtils.commit();
        } catch (Exception e) {
            DbUtils.rollback();
            e.printStackTrace();
        }
        return insert;
    }
}
