package org.example.Testo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/array")
public class Lesson1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        String [] nums = req.getParameterValues("nums");
        try {
            printWriter.println("<h2>Numbers: ");
            for (String n: nums){
                printWriter.println(n + " ");
            }
            printWriter.println("</h2>");
        } finally {
            printWriter.close();
        }
    }
}
