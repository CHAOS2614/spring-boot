package cn.edu.bjfu.springbootmybatis;

import cn.edu.bjfu.springbootmybatis.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDataMybatisApplicationTests {

    @Test
    void contextLoads() {
        Employee employee = new Employee();
        employee.setEmail("hello");
        System.out.println(employee);
    }

}
