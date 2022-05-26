<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.NamingException"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	try {
		Connection con = null;
		Context ctx = new InitialContext();
		Context envContext=(Context)ctx.lookup("java:/comp/env");
		DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		con = dataFactory.getConnection();
		out.println("DB에 연결 됨");
	} catch (NamingException e) {
		out.println("예외 발생 <br>");
		throw new ServletException("JNDI 오류",e);
	} catch(Exception e){
		out.println("연결실패"+e.getMessage());
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>