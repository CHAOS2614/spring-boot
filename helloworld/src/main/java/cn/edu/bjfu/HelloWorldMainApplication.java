package cn.edu.bjfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @link @SpringBootApplication 来标注一个主程序类，说明这是一个SpringBoot程序
 *
 * @author Chao Huaiyu
 * @date 2020/12/10
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        //启动Spring应用
        SpringApplication.run(HelloWorldMainApplication.class,args);

    }
}
