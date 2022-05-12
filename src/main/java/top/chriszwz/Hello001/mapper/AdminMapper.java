package top.chriszwz.Hello001.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.chriszwz.Hello001.pojo.Admin;

@Mapper
public interface AdminMapper {
    Admin selectByLogin(String username,String password);

}
