package cn.edu.bjfu.springbootmybatis.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Chaos
 * @date 2020/12/15
 */
@Setter
@Getter
@ToString
public class Employee {

    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer dId;

}
