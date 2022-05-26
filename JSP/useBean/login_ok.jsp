<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>
    <%
    	String id = request.getParameter("user_id");
    	String pw = request.getParameter("user_pw");
    	//db로 이동하여 id와 pw가져온다
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인성공</h1>
	아이디: <%=id %><br>
	비밀번호: <%=pw %>
</body>
</html>