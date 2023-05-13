package org.example;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class Main extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        try {
            Integer id = Integer.parseInt(req.getParameter("id"));
            printWriter.println("<h2>id: "+id*2+"</h2>");
        } finally {
            printWriter.close();
        }

        /*printWriter.write("Hello!");
        printWriter.close();*/
    }
}