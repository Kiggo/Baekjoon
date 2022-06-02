<%@page import="java.util.List"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <%request.setCharacterEncoding("utf-8"); %>
    <jsp:useBean id="m" class="bean.MemberBean" />
	<jsp:setProperty name="m" property="*" />
	<%
		MemberDAO memDAO = new MemberDAO();
		memDAO.addMember(m);
		List membersList = memDAO.listMembers();
		request.setAttribute("membersList", membersList);
		%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="memberList.jsp" />
</body>
</html>