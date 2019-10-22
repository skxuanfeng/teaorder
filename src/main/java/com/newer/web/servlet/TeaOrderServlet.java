package com.newer.web.servlet;

import com.newer.domain.TeaOrder;
import com.newer.service.TeaOrderService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/tea")
public class TeaOrderServlet extends HttpServlet {
    private TeaOrderService teaService;
    @Override
    public void init() throws ServletException {
        teaService=new TeaOrderService();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TeaOrder teaOrder=new TeaOrder();
        BeanUtils.populate(teaOrder,req.getParameter());
    }
}
