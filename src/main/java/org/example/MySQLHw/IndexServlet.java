package org.example.MySQLHw;

import org.example.MySQL.Product;
import org.example.MySQL.ProductDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List <Pet> pets = null;
        pets = PetDB.select();
        req.setAttribute("pets",pets);

        getServletContext().getRequestDispatcher("/index3.jsp").forward(req,resp);
    }
}
