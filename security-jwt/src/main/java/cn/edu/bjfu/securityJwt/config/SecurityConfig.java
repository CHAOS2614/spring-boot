package cn.edu.bjfu.securityJwt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * <p><a href="https://blog.csdn.net/weixin_42849689/article/details/89953107">@EnableWebSecurity的作用</a>
 *     首先,EnableWebSecurity注解是个组合注解,他的注解中,又使用了@EnableGlobalAuthentication注解:</p>
 * @author Chaos
 * @date 2020/12/22
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

}
