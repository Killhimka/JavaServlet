<%@page import="org.example.Testo.Calculator" %>
<%! int square (int n, int b){
    return n*b;
}%>
<%! int square1 (int n){
    return n*10;
}%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<jsp:include page="header.html"/>
<div>
    <form>
        <p>17*8=<%=17*8%></p>
        <p>78<12=<%=78<12%></p>

        <input name= "num1" value="5"><br>
        <input name= "num2" value="5"><br>
        <%--<input type="submit" name="submit"><br>--%>
        <input name="num3" value="6">
        <input type="submit" name="submit1"><br>
    </form>
</div>
<a href="Hello.html">Hy</a>
<div>
    <textarea name="about" id="1" cols="30" rows="5" >
        <%=new Calculator().testCalc(9)%>
    <%= square(Integer.parseInt(request.getParameter("num1")),Integer.parseInt(request.getParameter("num2"))) %>
         Count: <%=Integer.parseInt(request.getParameter("num1"))*
            Integer.parseInt(request.getParameter("num2"))%>

</textarea><br>
</div>
<div>

    <ul>
        <%
            for (int i = 0; i < 10; i++) {
                out.println("<li>"+square1(square(Integer.parseInt(request.getParameter("num1")),Integer.parseInt(request.getParameter("num2"))))+"</li>");
            }
        %>
    </ul>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>