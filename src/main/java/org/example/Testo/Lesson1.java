package org.example.Testo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet ("/array")

public class Lesson1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = getServletConfig().getInitParameter("message");
        String message1 = getServletContext().getInitParameter("message1");
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String [] nums = req.getParameterValues("nums");
        try {
            printWriter.println("<h2>"+message+"</h2>");
            printWriter.println("<h2>"+message1+"</h2>");
            printWriter.println("<h2>Numbers: ");
            printWriter.println("<h2>"+new Date()+"</h2>");
            for (String n: nums){
                printWriter.println(n + " ");
            }
            printWriter.println("</h2>");
        } finally {
            printWriter.close();
        }
    }
}
