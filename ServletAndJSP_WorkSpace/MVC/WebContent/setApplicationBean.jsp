<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user3" class="beans.User" scope="application"></jsp:useBean>
<jsp:setProperty property="email" name="user3" value="test@test.com"/>
<jsp:setProperty property="password" name="user3" value="123456"/>

</body>
</html>