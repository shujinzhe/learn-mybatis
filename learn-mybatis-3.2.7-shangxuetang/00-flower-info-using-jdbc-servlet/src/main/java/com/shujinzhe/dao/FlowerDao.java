package com.shujinzhe.dao;

import com.shujinzhe.pojo.Flower;

import java.util.List;

/**
 * @Title: FlowerDao
 * @Description: 花卉Dao接口
 * @Auther: MingLiang Yue
 * @Version: 1.0
 * @create 2019-04-04
 **/
public interface FlowerDao {
    /**
     * @Description  查询所有花卉
     * @Date 20:05 2019/4/4
     * @Param [code]
     * @return java.util.List<com.shujinzhe.com.shujinzhe.pojo.Flower>
     **/
    List<Flower> selectAll();

    /**
      * @Description  新增花卉信息
      * @Date 6:20 2019/4/5
      * @Param [flower]
      * @return 
    **/
    int insertOne(Flower flower);
}
