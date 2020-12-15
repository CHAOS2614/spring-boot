package cn.edu.bjfu.springbootmybatis.mapper;

import cn.edu.bjfu.springbootmybatis.entity.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author Chaos
 * @date 2020/12/15
 */
public interface DepartmentMapper {

    /**
     * 根据id查部门
     * @param id 部门id
     * @return 部门
     */
    @Select("select * from department where id = #{id}")
    Department getDeptById(Integer id);

    /**
     * 根据id删除部门
     * @param id 部门id
     * @return 影响行数
     */
    @Delete("delete from department where id = #{id}")
    int deleteById(Integer id);

    /**
     * 插入部门
     * @param department 部门
     * @return 影响行数
     */
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    int insertDept(Department department);
}
