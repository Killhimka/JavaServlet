package org.example.MySQL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            Product product = ProductDB.selectOne(id);
            if (product!=null){
                req.setAttribute("product",product);
                getServletContext().getRequestDispatcher("/edit.jsp").forward(req,resp);
            }
            else {
                getServletContext().getRequestDispatcher("/notfound.jsp").forward(req,resp);
            }
        }catch (Exception ex){
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(req,resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            String name = req.getParameter("name");
            int price = Integer.parseInt(req.getParameter("price"));
            Product product = new Product(id,name,price);
            ProductDB.update(product);
            resp.sendRedirect(req.getContextPath()+"/index2");
        } catch (Exception ex){
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(req,resp);
        }
    }
}
