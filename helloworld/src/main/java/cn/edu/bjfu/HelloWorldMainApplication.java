package cn.edu.bjfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Chao Huaiyu
 * @see <a href="https://www.bilibili.com/video/BV1gW411W76m?p=7">自动配置</a>
 * <p>@SpringBootConfiguration 标注在某个类上，表示这是一个Spring Boot的配置类</p>
 * <p>@EnableAutoConfiguration 开启自动配置功能</p>
 * <p>@AutoConfigurationPackage 自动配置包，将主配置类@SpringBootApplication所在的包及下面所有子包里面的组件扫描到Spring容器中</p>
 * <p> @SpringBootApplication 来标注一个主程序类，说明这是一个SpringBoot程序</p>
 * @date 2020/12/10
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //启动Spring应用
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }

}
