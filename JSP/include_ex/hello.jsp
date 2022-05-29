<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>hello.jsp입니다</h2>
	<%
	for(int i = 1; i<=10; i++){
		out.println("<h3>Hello JSP"+i+"</h3>");
	}
	%>
	<hr color=red>
	<b>오늘 날짜는?</b>  
	<font color=blue>
	<%
		Date today=new Date();
		out.println(today.toLocaleString());
	%>  
	</font>
	<hr color=green>
</body>
</html>