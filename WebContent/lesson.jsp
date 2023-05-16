<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%
    String n = request.getParameter("num1");
    String n1 = request.getParameter("num2");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<div>
<form>
<p>17*8=<%=17*8%></p><br>
<p>78<12=<%=78<12%></p>

<input name= "num1" value="5"><br>
<input name= "num2" value="5"><br>
    <input type="submit" name="submit">
</form>
</div>
<%
    List<String> list = new ArrayList();
    list.add(request.getParameter("about"));
    System.out.println(list.get(0));
    %>
<div>
    <textarea name="about" id="" cols="15" rows="3" >
    <%=Integer.parseInt(n) * Integer.parseInt(n1)%>
</textarea><br>
</div>
</body>
</html>
