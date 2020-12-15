package cn.edu.bjfu.springbootmybatis.mapper;

import cn.edu.bjfu.springbootmybatis.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Chaos
 * @date 2020/12/15
 */
@Mapper
public interface EmployeeMapper {

    /**
     * 查
     * @param id id
     * @return Employee
     */
    Employee getEmpById(Integer id);

    /**
     * 插
     * @param employee employee
     */
    void inertEmp(Employee employee);
}
