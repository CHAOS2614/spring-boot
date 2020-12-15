package cn.edu.bjfu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Chao Huaiyu
 * @date 2020/12/14
 */
@Controller
public class UserController {

    @PostMapping("/login")
    public String login(String username,String password){
        return "success";
    }
}
