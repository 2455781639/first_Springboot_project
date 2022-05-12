package top.chriszwz.Hello001.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.chriszwz.Hello001.mapper.EmployeeMapper;
import top.chriszwz.Hello001.pojo.Department;
import top.chriszwz.Hello001.pojo.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @Description: 员工dao
 * @Author: Chris(张文卓)
 * @Date: 2022/4/26 9:38
 */
@Repository
public class EmployeeDao {
    @Autowired
    private EmployeeMapper employeeMapper;

    //增加一个员工
    public void save(Employee employee){
        employeeMapper.insertEmployee(employee);
    }

    //查询全部员工信息
    public List<Employee> getAll(){
        return employeeMapper.queryList();
    }

    //通过id查询员工
    public Employee getEmployeeById(Integer id){
        return employeeMapper.EmployeeById(id);
    }

    //通过姓名查询员工
    public List<Employee> getEmployeeByLastName(String lastName){
        return employeeMapper.EmployeeByLastName(lastName);
    }

    //通过id删除员工
    public void delete(Integer id){
        employeeMapper.deleteById(id);
    }

    public void update(Employee employee){
        employeeMapper.updateEmployee(employee);
    }
}
