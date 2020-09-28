package com.example.demo.service;

import com.example.demo.entity.Toys;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ToysService {

    List<Toys> getToysList();

    Toys getToyById(String id);

    boolean insertToy(Toys toy);

    boolean updateToy(Toys toy);

    boolean delToy(String id);

}
