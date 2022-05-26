<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    String name  = "jsp";
    public String getName(){return name;}
    %>
    <% String age = request.getParameter("age"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>안녕하세요 <%=name %>님!!!</h1>
	<h1>getName();<%=getName() %></h1>
	<h1>나이는 <%=age %>살입니다!!</h1>
	<h1>나이+5는 <%=Integer.parseInt(age)+5 %></h1>
</body>
</html>