package com.example.demo.dao;

import com.example.demo.entity.Toys;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ToysDaoTest {

    @Autowired
    private ToysDao toysDao;

    @Test
    public void queryToys() {
        List<Toys> toysList = toysDao.queryToys();
        System.out.println("aabbccdd"+toysList);

    }

    @Test
    public void queryById() {
        Toys toy = toysDao.queryById(1);
        System.out.println("!!!!!!!!!!!!!!!"+toy.getName()+toy.getPrice()+toy.getContent());
    }

    @Test
    public void insetToy() {
        Toys toys = new Toys();
        toys.setName("大笨象");
        toys.setPrice(34.23);
        toys.setContent("大笨象会跳舞");
        toysDao.insetToy(toys);
    }

    @Test
    public void updateToy() {
        Toys toy = toysDao.queryById(1);
        toy.setContent("滴滴滴滴滴滴滴");
        toysDao.updateToy(toy);
    }

    @Test
    public void delToy() {
        toysDao.delToy(4);
    }
}