package com.example.springboot_webdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@Controller
public class hellocontrol  {
    /*@RequestMapping({"/","/Index.html"})
    public String index(){
        return "index";
    }*/
    @ResponseBody
    @RequestMapping("/demo")
    public String hello(){
        return "heelowoeld";
    }
    @RequestMapping("/success")
    public  String success(Map<String,Object> map){
        map.put("hello","你好");

        return "success";
    }
}