<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <% request.setCharacterEncoding("utf-8"); %>
    <jsp:useBean id="m1" class="bean.MemberBean" />
    <jsp:setProperty property="*" name="m1" />
    <jsp:useBean id="memberList" class="java.util.ArrayList" />
    <% MemberBean m2 = new MemberBean("java","java","java","java"); 
    	memberList.add(m1);
    	memberList.add(m2);%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" width=100%>
		<tr align="center" bgcolor="#99ccff">
			<td width="7%">아이디</td>
			<td width="7%">비밀번호</td>
			<td width="5%">이름</td>
			<td width="11%">이메일</td>
			<td width="5%">주소</td>
		</tr>
		<tr align="center">
			<td>${memberList[0].id }</td>
			<td>${memberList[0].pwd }</td>
			<td>${memberList[0].name }</td>
			<td>${memberList[0].email }</td>
		</tr>	
		<tr align="center">
			<td>${memberList[1].id }</td>
			<td>${memberList[1].pwd }</td>
			<td>${memberList[1].name }</td>
			<td>${memberList[1].email }</td>
		</tr>
		
	</table>
</body>
</html>