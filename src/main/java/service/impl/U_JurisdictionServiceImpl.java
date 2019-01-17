package service.impl;

import mapper.U_JurisdictionMapper;
import entity.U_Jurisdiction;
import org.springframework.stereotype.Service;
import service.U_JurisdictionService;

import javax.annotation.Resource;
import java.util.List;
@Service("U_JurisdictionService")
public class U_JurisdictionServiceImpl implements U_JurisdictionService {
    @Resource
    private U_JurisdictionMapper u_jurisdictionDao;

    @Override
    public List<U_Jurisdiction> getAll() {


        return u_jurisdictionDao.getAll();
    }

    @Override
    public U_Jurisdiction getInfoById( int ujid )
    {
        return u_jurisdictionDao.getInfoByid(ujid);
    }

    @Override
    public int add( U_Jurisdiction u_jurisdiction ) {

        return u_jurisdictionDao.add(u_jurisdiction);
    }

    @Override
    public int del( int ujid ) {
        return u_jurisdictionDao.del(ujid);
    }

    @Override
    public int update( U_Jurisdiction u_jurisdiction ) {
        return u_jurisdictionDao.update(u_jurisdiction);
    }
}
