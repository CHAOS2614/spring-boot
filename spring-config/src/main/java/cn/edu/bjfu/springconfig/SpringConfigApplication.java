package cn.edu.bjfu.springconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author chaos
 */
@SpringBootApplication
public class SpringConfigApplication {

    public static void main(String[] args) {
        System.out.println(new Date());
        SpringApplication.run(SpringConfigApplication.class, args);
    }

}
