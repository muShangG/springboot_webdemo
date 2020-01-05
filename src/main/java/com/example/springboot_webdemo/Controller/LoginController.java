package com.example.springboot_webdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;
import sun.security.util.Password;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    //    @GetMapping
    @PostMapping(value = "/user/login")
    //    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("pwd") String pwd, Map<String,Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123".equals(pwd)){
            session.setAttribute("loginuser",username);
            return "redirect:/main.html";
        }else {
            map.put("msg","用户名或密码错误");
            return "login";
        }

    }
}
