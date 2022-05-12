package top.chriszwz.Hello001.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.chriszwz.Hello001.pojo.Employee;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    List<Employee> queryList();

    void insertEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee EmployeeById(Integer id);

    List<Employee> EmployeeByLastName(String lastName);
    void deleteById(Integer id);

}
