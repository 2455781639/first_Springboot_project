package top.chriszwz.Hello001.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @Description: 部门
 * @Author: Chris(张文卓)
 * @Date: 2022/4/26 9:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private Integer id;//部门id
    private String departmentName;//部门名
}
