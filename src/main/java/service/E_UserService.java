package service;

import entity.E_User;

import java.util.List;

public interface E_UserService {
    //查询
    public List<E_User> getAll();
    //增加
    public int  add(E_User e_user);
    //删除
    public  int del(int euid);
    //修改
    public  E_User update(E_User e_user );
    //按id查询
    public E_User getInfoById(int euid);

}
