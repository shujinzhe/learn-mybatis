package com.shujinzhe.dao.impl;

import com.shujinzhe.dao.FlowerDao;
import com.shujinzhe.pojo.Flower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Title: FlowerDaoImpl
 * @Description:
 * @Auther: MingLiang Yue
 * @Version: 1.0
 * @create 2019-04-04
 **/
public class FlowerDaoImpl implements FlowerDao {
    /**
     * @Description  实现类 查询所有花卉
     * @Date 20:21 2019/4/4
     * @Param []
     * @return java.util.List<com.shujinzhe.com.shujinzhe.pojo.Flower>
     **/
    @Override
    public List<Flower> selectAll() {
        List<Flower> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis327",
                    "root","123456");
            ps = conn.prepareStatement("select * from flower");
            rs = ps.executeQuery();
            while (rs.next()){
                list.add(new Flower(rs.getInt(1),rs.getString(2)
                        ,rs.getDouble(3),rs.getString(4)));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    /**
      * @Description  实现类  插入花卉信息
      * @Date 6:07 2019/4/5
      * @Param [flower]
      * @return 影响行数
    **/
    @Override
    public int insertOne(Flower flower) {
        int index = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis327",
                    "root","123456");
            ps = conn.prepareStatement("insert into flower values(default,?,?,?)");
            ps.setObject(1,flower.getName());
            ps.setObject(2,flower.getPrice());
            ps.setObject(3,flower.getProduction());
            index = ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return index;
    }
}
