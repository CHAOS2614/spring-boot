package cn.edu.bjfu.springconfig;

import cn.edu.bjfu.springconfig.bean.Dog;
import cn.edu.bjfu.springconfig.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 */
@SpringBootTest
class SpringConfigApplicationTests {

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

}
