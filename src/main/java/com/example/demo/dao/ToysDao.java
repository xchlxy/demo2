package com.example.demo.dao;

import com.example.demo.entity.Toys;

import java.util.List;

public interface ToysDao {
    List<Toys> queryToys();
    Toys queryById(int id);
    int insetToy(Toys toy);
    int updateToy(Toys toy);
    int delToy(int id);

}
