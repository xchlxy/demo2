package com.example.demo.service;

import com.example.demo.dao.ToysDao;
import com.example.demo.entity.Toys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToysServiceImpl{

    @Autowired
    private ToysDao toysDao;


    public List<Toys> getToysList() {

        return toysDao.queryToys();
    }


    public Toys getToyById(String id) {
        return toysDao.queryById(Integer.valueOf(id));
    }


    public boolean insertToy(Toys toy) {
        return false;
    }


    public boolean updateToy(Toys toy) {
        return false;
    }


    public boolean delToy(String id) {
        return false;
    }
}
