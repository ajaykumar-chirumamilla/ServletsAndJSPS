<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:out value="${user1.name}"></c:out>
	<br />
	<c:out value="${user2.name}"></c:out>
	<br />
	<c:out value="${user3.name}"></c:out>
	<br />


	<c:out value="${sessionScope.user2.name}"></c:out>
	<br />

	<c:out value='${map1["fruit"]}'></c:out>
	<br />
	<c:out value="${link}"></c:out>
	<br /> ${link }
	<br />
	<table style="border:1px solid grey;">
	
	<c:forEach var="animal" items="${list1}">
<tr><td>${animal.name}</td><td>${animal.id}</td></tr><br />
	</c:forEach>
	</table>
</body>
</html>