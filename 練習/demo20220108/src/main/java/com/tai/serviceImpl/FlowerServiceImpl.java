package com.tai.serviceImpl;

import com.tai.dao.FlowerDao;
import com.tai.dao.impl.FlowerDaoImpl;
import com.tai.pojo.Flower;
import com.tai.service.FlowerService;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    private FlowerDao flowerDao = new FlowerDaoImpl();

    @Override
    public List<Flower> show() {

        return flowerDao.selAll();
    }

    @Override
    public int add(Flower flower) {
        return flowerDao.add(flower);
    }
}
