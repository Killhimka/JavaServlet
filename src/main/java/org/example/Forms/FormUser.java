package org.example.Forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello1")
public class FormUser extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        String name = req.getParameter("username");
        String age = req.getParameter("userage");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");
        String [] courses = req.getParameterValues("courses");

        try {
            printWriter.println("<p>Name: "+name+"</p>");
            printWriter.println("<p>Age: "+age+"</p>");
            printWriter.println("<p>Gender: "+gender+"</p>");
            printWriter.println("<p>Country: "+country+"</p>");
            printWriter.println("<h5>Courses</h5>");
            for (String course: courses){
                printWriter.println("<li>"+course+"</li>");
            }
        }finally {
            printWriter.close();
        }
    }
}
