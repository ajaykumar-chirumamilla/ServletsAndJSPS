<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user1" class="beans.User" scope="page"></jsp:useBean>
<jsp:setProperty property="email" name="user1" value="test@test.com"/>
<jsp:setProperty property="password" name="user1" value="123456"/>
Email: <%= user1.getEmail() %>
</body>
</html>