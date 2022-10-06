package com.tai.service;

import com.tai.pojo.Flower;

import java.util.List;

public interface FlowerService {
    List<Flower> show();
    int add(Flower flower);
}
