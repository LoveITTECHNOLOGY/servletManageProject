package com.dao;

import com.entity.Emp;

import java.util.List;

public interface EmpDao {
    //定义一个查询所有员工信息
    public List<Emp> selectAll();
   public int delete(int id);
   public Emp select(int id);
   public int update(Emp emp);
   //增加
    public int insert(Emp emp);
}
