package cn.edu.bjfu.springbootmybatis.controller;

import cn.edu.bjfu.springbootmybatis.entity.Employee;
import cn.edu.bjfu.springbootmybatis.mapper.EmployeeMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chaos
 * @date 2020/12/15
 */
@RestController
public class EmpController {

    private final EmployeeMapper employeeMapper;

    public EmpController(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }
}
