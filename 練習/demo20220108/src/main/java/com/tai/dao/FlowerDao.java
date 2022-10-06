package com.tai.dao;

import com.tai.pojo.Flower;

import java.util.List;

public interface FlowerDao {
    List<Flower> selAll();
    int add(Flower flower);
}
