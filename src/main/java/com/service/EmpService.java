package com.service;

import com.entity.Emp;

import java.util.List;

public interface EmpService {
    //显示所有员工信息
    public List<Emp> showAllEmpInfo();
    //去除id
    public int removeId(int id);
    //显示要修改/删除的id
    public Emp showId(int id);
    //显示要修改的员工
   public int showUpdateEmp(Emp emp);
   //显示要增加的员工信息
    public int showInsertEmp(Emp emp);
}
