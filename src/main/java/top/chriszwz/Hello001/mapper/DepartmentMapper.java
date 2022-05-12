package top.chriszwz.Hello001.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.chriszwz.Hello001.pojo.Department;

import java.util.Collection;
import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Department> queryList();

    Department departmentById(Integer id);

    List<String> queryListName();

    Integer queryListNum(String name);


}
