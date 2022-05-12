package top.chriszwz.Hello001.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;
import top.chriszwz.Hello001.dao.AdminDao;
import top.chriszwz.Hello001.dao.DepartmentDao;
import top.chriszwz.Hello001.pojo.Admin;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    AdminDao adminDao;

    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        Admin admin = adminDao.selectByLogin(username, password);

        if (admin != null){
            List<String> list = departmentDao.getAllName();
            List<Integer> num = departmentDao.getAllNum();
            System.out.println(list);
//            model.addAttribute("department",list);
            session.setAttribute("department",list);
            session.setAttribute("num",num);
            session.setAttribute("loginUser",username);

            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","用户名或密码错误！");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.html";
    }
}
