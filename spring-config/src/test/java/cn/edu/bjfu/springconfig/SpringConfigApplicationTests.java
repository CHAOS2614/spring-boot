package cn.edu.bjfu.springconfig;

import cn.edu.bjfu.springconfig.bean.Dog;
import cn.edu.bjfu.springconfig.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 */
@SpringBootTest
class SpringConfigApplicationTests {

    @Autowired
    ApplicationContext ioc;

    @Autowired
    Person person;

    @Autowired
    Dog dog;

    @Test
    void contextLoads() {
        System.out.println(dog);
        System.out.println(person);
        System.out.println(dog == person.getDog());
    }

    @Test
    void helloWorldTest(){
        System.out.println(ioc.containsBean("helloService"));
    }

}
