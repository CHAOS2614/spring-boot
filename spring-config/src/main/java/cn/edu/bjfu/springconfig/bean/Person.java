package cn.edu.bjfu.springconfig.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组建中
 * <p>@ConfigurationProperties:告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 *    prefix = "person":配置文件中哪个下面的所有属性进行一一映射
 *
 *    只有这个组件是容器中的组件，才能提供@ConfigurationProperties功能
 *    默认从全局配置文件中获取值
 *    可以使用@PropertySource指定配置文件进行获取属性值</p>
 * @author Chao Huaiyu
 * @date 2020/12/11
 */
@ConfigurationProperties(prefix = "person")
@Component
@PropertySource(value = {"classpath:person.properties"})
public class Person {

    private String name;
    private Integer age;
    private Boolean sex;
    private Date birthday;
    private Map<String,Object> map;
    private List<Object> list;

    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}

