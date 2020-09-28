package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "index";
    }

//    @RequestMapping("/hello2")
//    public ModelAndView sayHi2(){
//        return new ModelAndView("index");
//    }

}
