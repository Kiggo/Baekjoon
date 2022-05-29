<%@page import="java.sql.Connection"%>
<%@page import="util.DBSingleton"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Connection con = DBSingleton.getInstance();
	String str="";
	if(con!=null){
		str="DB연결 성공";
	}else
		str="연결 실패";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=str %>
</body>
</html>