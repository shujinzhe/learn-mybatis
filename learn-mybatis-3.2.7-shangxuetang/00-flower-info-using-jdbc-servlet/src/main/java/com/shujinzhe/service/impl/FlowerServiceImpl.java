package com.shujinzhe.service.impl;

import com.shujinzhe.dao.FlowerDao;
import com.shujinzhe.dao.impl.FlowerDaoImpl;
import com.shujinzhe.pojo.Flower;
import com.shujinzhe.service.FlowerService;

import java.util.List;

/**
 * @Title: FlowerServiceImpl
 * @Description:
 * @Auther: MingLiang Yue
 * @Version: 1.0
 * @create 2019-04-04
 **/
public class FlowerServiceImpl implements FlowerService {
    private FlowerDao flowerDao = new FlowerDaoImpl();

    @Override
    public List<Flower> show() {
        return flowerDao.selectAll();
    }

    @Override
    public int add(Flower flower) {
        return flowerDao.insertOne(flower);
    }
}
