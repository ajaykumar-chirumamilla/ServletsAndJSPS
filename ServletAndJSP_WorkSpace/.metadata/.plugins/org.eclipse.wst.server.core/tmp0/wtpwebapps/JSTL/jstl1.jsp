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
	<c:out value="Hello World JSTL!"></c:out>
	<jsp:useBean id="test" class="beans.TestBean" scope="page"></jsp:useBean>
	<p>
		Value of info "attribute":
		<c:out value="${test.info}"></c:out>
	</p>

	<%-- Getting Parameters --%>
	Name Parameter:
	<c:out value=" ${param.name}"></c:out>

	<%-- JSTL if --%>
	<p />
	<c:if test='${param.name == "ajay"}'>
Hello Ajay!
</c:if>

	<c:if test='${param.name != "ajay"}'>
Hello There!
</c:if>
	<p />
	<%-- JSTL Choose --%>
	<c:choose>
		<c:when test='${param.id == 1}'>
			<b>Id is equal to 1</b>
		</c:when>

		<c:when test='${param.id == 2}'>
			<b>Id is equal to 2</b>
		</c:when>

		<c:otherwise>
			<b>Id is greater than two</b>
		</c:otherwise>

	</c:choose>
	<p />
	<%-- JSTL for loop --%>
	<c:forEach var="i" begin="0" end="10" step="2" varStatus="status">
	Loop Counter is: <c:out value="${i}"></c:out>
		<br />
		<c:if test="${status.first}">This was the first Iteration</c:if>
		<c:if test="${status.last}">This was the last Iteration</c:if>
	</c:forEach>

</body>
</html>