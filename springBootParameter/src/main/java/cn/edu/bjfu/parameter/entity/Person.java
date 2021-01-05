package cn.edu.bjfu.parameter.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Chaos
 * @date 2021/1/4
 */
@Data
@ToString
public class Person {
    private String username;
    private Integer age;
    private Date birth;
    private Pet pet;
}
