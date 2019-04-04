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
import java.util.List;

/**
 * @Title: ShowServlet
 * @Description:
 * @Auther: MingLiang Yue
 * @Version: 1.0
 * @create 2019-04-04
 **/
@WebServlet("/show")
public class ShowServlet extends HttpServlet {
    private FlowerService flowerService = new FlowerServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        List<Flower> list = flowerService.show();
        req.setAttribute("list",list);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
