<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("utf-8");
    	request.setAttribute("id", "java");
    	request.setAttribute("pwd", "java");
    	session.setAttribute("name", "java");
    	application.setAttribute("email","java@test.com"); %>
    	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="member1.jsp" />
</body>
</html>