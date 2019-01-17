package service.impl;

import mapper.E_UserMapper;
import entity.E_User;
import org.springframework.stereotype.Service;
import service.E_UserService;

import javax.annotation.Resource;
import java.util.List;
@Service("E_UserService")
public class E_UserServiceImpl implements E_UserService {
    @Resource
    private E_UserMapper e_userDao;
    @Override
    public List<E_User> getAll() {
        return e_userDao.getAll();
    }

    @Override
    public int add( E_User e_user ) {
        return e_userDao.add(e_user);
    }

    @Override
    public int del( int euid ) {

        return e_userDao.del(euid);
    }

    @Override
    public E_User update( E_User e_user ) {

        return e_userDao.update(e_user);
    }

    @Override
    public E_User getInfoById( int euid ) {

        return e_userDao.getInfoById(euid);
    }
}
