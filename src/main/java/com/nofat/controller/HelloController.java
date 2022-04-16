package com.nofat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 2020/5/16.
 */
@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/sayHi")
    public String sayHello() {

        System.out.println("Hello SpringMVC！");

        return "success";
    }


}
