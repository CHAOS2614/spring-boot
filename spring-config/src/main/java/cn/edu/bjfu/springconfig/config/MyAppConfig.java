package cn.edu.bjfu.springconfig.config;

import cn.edu.bjfu.springconfig.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>@Configuration指明当前类是一个配置类，来替代spring的配置文件</p>
 * @author Chao Huaiyu
 * @date 2020/12/12
 */
@Configuration
public class MyAppConfig {

    /**
     * <p>将方法的返回值添加到容器中，这个组件的默认id就是方法名</p>
     * @return HelloService
     */
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加了组件!");
        return new HelloService();
    }
}
