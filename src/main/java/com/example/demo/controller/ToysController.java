package com.example.demo.controller;

import com.example.demo.entity.Toys;
import com.example.demo.service.ToysService;
import com.example.demo.service.ToysServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/toys")
public class ToysController {

    @Autowired
    private ToysServiceImpl toysService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private Map<String, Object> listToys(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        //List<Toys> list = toysService.getToysList();
        modelMap.put("toysList","aa");
        return modelMap;

    }

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    private Map<String, Object> getToy(){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        Toys toy = toysService.getToyById("1");
        modelMap.put("toysList",toy);
        return modelMap;

    }
}
