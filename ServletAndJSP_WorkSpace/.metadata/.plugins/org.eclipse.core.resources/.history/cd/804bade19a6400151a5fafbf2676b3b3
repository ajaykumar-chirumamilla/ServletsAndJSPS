<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="copyright.txt" %>
<p/>
<jsp:include page="updates.txt"></jsp:include>

<%@ include file="variables.jsp" %>
<%= name %>

<% String id=request.getParameter("id"); %>
<% if(id==null) { %>
<jsp:include page="idnotfound.html"></jsp:include>
<%} else { %>
<jsp:include page="id.html"></jsp:include>
<%} %>
</body>
</html>