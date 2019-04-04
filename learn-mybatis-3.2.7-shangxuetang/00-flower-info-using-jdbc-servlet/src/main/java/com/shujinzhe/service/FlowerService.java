package com.shujinzhe.service;

import com.shujinzhe.pojo.Flower;

import java.util.List;

/**
 * @Title: FlowerService
 * @Description:
 * @Auther: MingLiang Yue
 * @Version: 1.0
 * @create 2019-04-04
 **/
public interface FlowerService {
    /**
     * @Description  显示所有花卉信息
     * @Date 20:25 2019/4/4
     * @Param []
     * @return 
     **/
    List<Flower> show();

    /**
      * @Description 添加
      * @Date 6:11 2019/4/5
      * @Param [flower]
      * @return
    **/
    int add(Flower flower);
}
