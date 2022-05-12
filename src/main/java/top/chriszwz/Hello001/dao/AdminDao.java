package top.chriszwz.Hello001.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.chriszwz.Hello001.mapper.AdminMapper;
import top.chriszwz.Hello001.pojo.Admin;

@Repository
public class AdminDao {

    @Autowired
    private AdminMapper adminMapper;

    public Admin selectByLogin(String username,String password){
        return adminMapper.selectByLogin(username,password);
    }
}
