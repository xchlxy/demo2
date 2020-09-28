package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Demo2Controller {

    @RequestMapping("testt")
    public String test(){
        return "test";
    }

}
