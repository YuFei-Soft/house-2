package mapper;

import entity.E_User;

import java.util.List;

public interface E_UserMapper {
    //查询所有
    public List<E_User> getAll();

    //按ID查询
    public E_User getInfoById(int euid);

    //增加
    public  int  add(E_User e_user);

    //删除
    public int del(int euid);

    //修改
    public   E_User update(E_User e_user);

}
