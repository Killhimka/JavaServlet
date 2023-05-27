<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.05.2023
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create product</title>
</head>
<body>
<h3>New product</h3>
<form method="post1">
    <label>Name</label><br>
    <input name="name"/><br><br>
    <label>Price</label><br>
    <input name="price" type="number" min="100"/><br><br>
    <input type="submit" value="Save" />
</form>
</body>
</html>
