<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="JSPDB.MemberDAO"%>
<%@page import="JSPDB.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
	h1 { text-align: center;}
</style>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
	<h1>회원 정보 출력</h1>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	MemberVO vo = new MemberVO();
	vo.setName(name);
	//vo.setName(request.getParameter("name"));
	MemberDAO dao = new MemberDAO();
	List<MemberVO> list = dao.searchNameMembers(vo);
%>
	<table border=1 width=800 align=center>
		<tr align=center bgcolor="#FFFF66">
		<td>아이디</td>
		<td>비밀번호</td>
		<td>이름</td>
		<td>이메일</td>
		<td>가입일자</td>
<%
	for(int i = 0; i<list.size(); i++){
		MemberVO memberVO = (MemberVO) list.get(i);
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		String name2 = memberVO.getName();
		String email = memberVO.getEmail();
		Date joinDate = memberVO.getJoinDate();
%>
	<tr align=center>
		<td><%=id %></td>
		<td><%=pwd %></td>
		<td><%=name2 %></td>
		<td><%=email %></td>
		<td><%=joinDate %></td>
<%
	}
%>
	</table>
</body>
</html>