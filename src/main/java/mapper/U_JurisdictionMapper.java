package mapper;

import entity.U_Jurisdiction;

import java.util.List;

public interface U_JurisdictionMapper {
    //查询
    public List<U_Jurisdiction> getAll();

    //按id查询
    public U_Jurisdiction getInfoByid( int ujid );

    //增加
    public int add(U_Jurisdiction u_jurisdiction );
    //修改
    public  int update(U_Jurisdiction u_jurisdiction);
    //删除
    public  int del(int ujig);
}
