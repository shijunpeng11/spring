package com.example.springbootdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello W";
    }

}
