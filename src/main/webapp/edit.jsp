<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.05.2023
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h3>Edit product</h3>
<form method="post1">
    <input type="hidden" value="${product.id}" name="id"/>
    <label>Name</label><br>
    <input name="name" value="${product.name}"/><br>
    <label>Price</label><br>
    <input name="price" value="${product.price}" type="number" min="100"/><br><br>
    <input type="submit" value="Send">
</form>
</body>
</html>
