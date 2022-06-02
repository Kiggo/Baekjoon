<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%request.setCharacterEncoding("utf-8"); %>
    <jsp:useBean id="membersList" class="java.util.ArrayList"/>
    <jsp:useBean id="membersMap" class="java.util.HashMap"/>
    <%
    membersMap.put("id", "java");
    membersMap.put("pwd", "4321");
    membersMap.put("name", "자바");
    membersMap.put("email", "java@test.com");
    
    MemberBean m1 = new MemberBean("korea", "korea", "korea", "korea"); 
    MemberBean m2 = new MemberBean("korea2","korea2","korea2","korea2"); 
    membersList.add(m1);
    membersList.add(m2);
    membersMap.put("membersList", membersList);
    %>
    <c:set var="membersList" value="${membersMap.membersList}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center" >
		<tr align="center" bgcolor="#99ccff">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>이메일</b></td>
		</tr>
		<tr align="center">
			<td>${membersMap.id }</td>
			<td>${membersMap.pwd }</td>
			<td>${membersMap.name }</td>
			<td>${membersMap.email }</td>
		</tr>
		<tr align="center">
			<td>${membersList[0].id }</td>
			<td>${membersList[0].pwd }</td>
			<td>${membersList[0].name }</td>
			<td>${membersList[0].email }</td>
		</tr>
		<tr align="center">
			<td>${membersList[1].id }</td>
			<td>${membersList[1].pwd }</td>
			<td>${membersList[1].name }</td>
			<td>${membersList[1].email }</td>
		</tr>
	</table>
</body>
</html>