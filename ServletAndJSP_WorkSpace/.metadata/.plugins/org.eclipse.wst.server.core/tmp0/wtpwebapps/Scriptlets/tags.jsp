<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%/* directive tag */ %>
<%@ page import="java.util.*" %>

<%/* expression tag*/ %>
<%= "Hello from an expression tag at time:\t"+new Date()+"\tBy:\t"+name %>

<%/*declarative tag*/ %>
<%!private String name="Ajay"; %>
<br/>
<% /*Scriptlet Tag*/%>
<%
for(int i=0;i<5;i++)
{
%>
This is looped<br/>
<% } %>

</body>
</html>