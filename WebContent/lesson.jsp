
<%
    String n = request.getParameter("num1");
    String n1 = request.getParameter("num2");
    int p = Integer.parseInt(n) * Integer.parseInt(n1);
%>
<%! int square (int n){
    return n*10;
}%>

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
    <input type="submit" name="submit"><br>
    <input name="num3" value="6">
    <input type="submit" name="submit1"><br>
</form>
</div>
<div>
    <textarea name="about" id="1" cols="15" rows="3" >
    <%= p %>
</textarea><br>
</div>
    <div>

        <ul>
            <%
                for (int i = 0; i < 10; i++) {
                   out.println("<li>"+square(p)+"</li>");
                }
            %>
        </ul>
</div>
</body>
</html>
