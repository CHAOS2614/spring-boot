package cn.edu.bjfu.springbootmybatis.controller;

import cn.edu.bjfu.springbootmybatis.entity.Department;
import cn.edu.bjfu.springbootmybatis.mapper.DepartmentMapper;
import org.springframework.web.bind.annotation.*;

/**
 * @author Chaos
 * @date 2020/12/15
 */
@RestController
public class DeptController {

    private final DepartmentMapper departmentMapper;

    public DeptController(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @GetMapping("/dept/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @PostMapping("/dept")
    public Department insert(Department department){
        System.out.println(departmentMapper.insertDept(department));
        return department;
    }

    @DeleteMapping("/dept/{id}")
    public Integer deleteById(@PathVariable("id") Integer id){
        return departmentMapper.deleteById(id);
    }

}
