package org.example.Testo;

import org.example.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class JspUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User tom = new User("Tom",35);
        req.setAttribute("user",tom);
        getServletContext()
                .getRequestDispatcher("/user.jsp")
                .forward(req,resp);
    }
}
