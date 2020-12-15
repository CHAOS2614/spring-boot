package cn.edu.bjfu.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>@MapperScan开启Mapper扫描，不用标注Mapper注解了</p>
 * @author chaos
 */
@MapperScan(value = "cn.edu.bjfu.springbootmybatis.mapper")
@SpringBootApplication
public class SpringBootDataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataMybatisApplication.class, args);
    }

}
