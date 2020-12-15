package cn.edu.bjfu.springboot.controller;

import cn.edu.bjfu.springboot.dao.DepartmentDao;
import cn.edu.bjfu.springboot.dao.EmployeeDao;
import cn.edu.bjfu.springboot.entities.Department;
import cn.edu.bjfu.springboot.entities.Employee;
import com.fasterxml.jackson.core.JsonFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * @author Chao Huaiyu
 * @date 2020/12/14
 */
@Controller
public class EmployeeController {

    private final EmployeeDao employeeDao;
    private final DepartmentDao departmentDao;

    @Autowired
    public EmployeeController(EmployeeDao employeeDao,DepartmentDao departmentDao) {
        this.employeeDao = employeeDao;
        this.departmentDao = departmentDao;
    }

    /**
     * 查询所有员工
     * @return 所有员工
     */
    @ResponseBody
    @GetMapping("/emps")
    public Collection<Employee> list(){
        return employeeDao.getAll();
    }

    /**
     * 添加emp
     * @return dep
     */
    @ResponseBody
    @PostMapping("/emp")
    public Collection<Department> addEmp(Employee employee){
        System.out.println(employee);
        return departmentDao.getDepartments();
    }

    @ResponseBody
    @GetMapping("/emp/{id}")
    public Employee get(@PathVariable("id") Integer id){
        System.out.println("get--->" + employeeDao.get(id));
        return employeeDao.get(id);
    }

    @ResponseBody
    @DeleteMapping("/emp/{id}")
    public Employee delete(@PathVariable("id") Integer id){
        System.out.println("delete--->" + employeeDao.get(id));
        return employeeDao.get(id);
    }

    @ResponseBody
    @PutMapping("/emp/{id}")
    public Employee update(@PathVariable("id") Integer id){
        System.out.println("update--->" + employeeDao.get(id));
        return employeeDao.get(id);
    }
}
