<%
    String message = pageContext.getException().getMessage();
    String exception = pageContext.getException().getClass().getString();
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Exception</title>
</head>
<body>
<h2>Exception occurred while processing the request</h2>
<p>Type: <%= exception %></p>
<p>Message: <%= message %></p>
</body>
</html>
