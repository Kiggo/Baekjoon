<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>bottom.jsp입니다</h1>
	<h3 color=blue>내가 만든 구구단</h3>
	<table width=90% border=1>
		<tr>
	<% for(int i = 2; i<10; i++){ %>
		<th><%out.println(i+"단"); %></th>
	<% } %>
		</tr>
	<% for(int i = 1; i<10; i++){ %>
		<tr>
		<% for(int k = 2; k<10; k++){ %>
			<td><% out.println(k+"*"+i+"="+(i*k));%></td>
			<% } %>
		</tr>
		<% } %>
	</table>
</body>
</html>