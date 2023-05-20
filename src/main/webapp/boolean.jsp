<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% int age1 = 5;
int age2 = 7;
boolean isVisible1 = age1<=age2;
request.setAttribute("isVisible",isVisible1);
String [] user1 = new String[]{"use1","use2","use3"};
request.setAttribute("users",user1);%>


<c:if test = "${isVisible == true}">
    ${isVisible} Yes
</c:if>
<c:if test = "${isVisible == false}">
    ${isVisible} No
</c:if>
