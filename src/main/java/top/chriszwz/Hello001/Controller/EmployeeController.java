package top.chriszwz.Hello001.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.chriszwz.Hello001.dao.DepartmentDao;
import top.chriszwz.Hello001.dao.EmployeeDao;
import top.chriszwz.Hello001.pojo.Department;
import top.chriszwz.Hello001.pojo.Employee;

import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String list(Model model){
        List<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddpage(Model model){
        //查出所有部门信息
        List<Department> departments = departmentDao.getDepartment();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println(employee.toString());
        //添加操作 forward
        employeeDao.save(employee);//保存员工信息
        return "redirect:/emps";
    }

    //修改页面
    @GetMapping("/emp/{id}")
    public String toUpdate(@PathVariable("id")Integer id,Model model){
        Employee employee = employeeDao.getEmployeeById(id);
        System.out.println(employee.toString());
        model.addAttribute("emp",employee);
        //查出所有部门信息
        List<Department> departments = departmentDao.getDepartment();
        model.addAttribute("departments",departments);
        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        employeeDao.update(employee);
        return "redirect:/emps";
    }

    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id")Integer id,Model model){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
    @RequestMapping("/searchEmp")
    public String searchEmp(String lastName, Model model){
        System.out.println(lastName);
        List<Employee> list = employeeDao.getEmployeeByLastName(lastName);
        model.addAttribute("emps",list);
        return "emp/list";
    }

}
