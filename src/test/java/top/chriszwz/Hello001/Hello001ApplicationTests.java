package top.chriszwz.Hello001;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.chriszwz.Hello001.dao.AdminDao;
import top.chriszwz.Hello001.dao.DepartmentDao;
import top.chriszwz.Hello001.dao.EmployeeDao;
import top.chriszwz.Hello001.pojo.Admin;
import top.chriszwz.Hello001.pojo.Department;
import top.chriszwz.Hello001.pojo.Employee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
class Hello001ApplicationTests {

	@Autowired
	DepartmentDao departmentDao;

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	AdminDao adminDao;

	@Test
	 void contextLoads() throws Exception {
		List<Integer> num = departmentDao.getAllNum();
		num.forEach(System.out::println);
	}

}
