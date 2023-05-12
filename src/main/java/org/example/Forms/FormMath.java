package org.example.Forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;

@WebServlet("/math")
public class FormMath extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        int number1 = Integer.valueOf(req.getParameter("number1"));
        int number2 = Integer.valueOf(req.getParameter("number2"));
        String action = req.getParameter("action");
        try {
            if (action.contains("*"))
            printWriter.println(number1*number2);
            else if (action.contains("/"))
            printWriter.println(number1/number2);
            else if (action.contains("+"))
            printWriter.println(number1+number2);
            else printWriter.println(number1-number2);
        } finally {
            printWriter.close();
        }
    }
}
