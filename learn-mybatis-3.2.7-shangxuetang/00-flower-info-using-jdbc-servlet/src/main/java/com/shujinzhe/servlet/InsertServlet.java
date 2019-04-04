package com.shujinzhe.servlet;

import com.shujinzhe.pojo.Flower;
import com.shujinzhe.service.FlowerService;
import com.shujinzhe.service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title: InsertServlet
 * @Description: com.shujinzhe.servlet
 * @Auther: MingLiang Yue
 * @Version: 1.0
 * @create 2019-04-05
 */
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
    private FlowerService flowerService = new FlowerServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");
        String price = req.getParameter("price");
        String production = req.getParameter("production");
        Flower flower = new Flower();
        flower.setName(name);
        flower.setPrice(Double.parseDouble(price));
        flower.setProduction(production);
        int index = flowerService.add(flower);
        if(index>0) {
            //防止表单重复提交
            resp.sendRedirect("show");
        } else {
            resp.sendRedirect("add.jsp");
        }
    }
}
