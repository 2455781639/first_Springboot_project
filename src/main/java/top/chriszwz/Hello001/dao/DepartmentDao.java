package top.chriszwz.Hello001.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.chriszwz.Hello001.mapper.DepartmentMapper;
import top.chriszwz.Hello001.pojo.Department;

import java.util.*;

/*
 * @Description: 部门dao
 * @Author: Chris(张文卓)
 * @Date: 2022/4/26 9:31
 */
@Repository//被Spring托管
public class DepartmentDao {
    public final DepartmentMapper departmentMapper;

    public DepartmentDao(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }


    //获得所有部门信息
    public List<Department> getDepartment(){
        return departmentMapper.queryList();
    }

    //通过id得到部门
    public Department getDepartmentById(Integer id){
        return departmentMapper.departmentById(id);
    }

    //获取所有部门名
    public List<String> getAllName(){
        return departmentMapper.queryListName();
    }

    //查出所有部门的人数
    public List<Integer> getAllNum(){
        List<String> list = departmentMapper.queryListName();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(String name:list){
            arrayList.add(departmentMapper.queryListNum(name));
        }
        return arrayList;
    }
}
