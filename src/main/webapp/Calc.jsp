<%@ page import="org.example.Testo.Calculator" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="static java.lang.Integer.parseInt" %>
<%--<%=new Calculator().testCalc(Integer.parseInt(request.getParameter("num1")))%><br>
         Count: <% Integer p = Integer.parseInt(request.getParameter("num1"));
         Integer p1 = Integer.parseInt(request.getParameter("num2"));
        out.println("<h2>"+p*p1+"</h2>");%>--%>
<%=
Integer.parseInt(request.getParameter("num1"))*Integer.parseInt(request.getParameter("num2"))
%>
