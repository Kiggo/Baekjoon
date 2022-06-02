<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <% request.setCharacterEncoding("utf-8"); %>
    <c:set var="id" value="hong"/>
    <c:set var="pwd" value="1234" />
   <%--  <c:set var="name" value="${'홍길동' }" /> --%>
    <c:set var="age" value="${25 }" />
    <c:set var="height" value="${180 }" />
    <c:set var="contextPath" value="${pageContext.request.contextPath }"/>
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
			<td width="7%"><b>나이</b></td>
			<td width="7%"><b>키</b></td>
		</tr>
		<tr align="center">
			<td>${id}</td>
			<td>${pwd}</td>
			<td>${name}</td>
			<td>${age}</td>
			<td>${height}</td>
		</tr>

		<a href="${contextPath }/el.built_in_Object/memberForm.jsp">회원가입하기</a>
		
		<c:if test="${true}">
			<h1>항상 참이다</h1>
			</c:if>
		<c:if test="${11==11}">
			<h1>두 값은 같습니다</h1>
			</c:if>		
		<c:if test="${100!=200}">
			<h1>두 값은 같지 않습니다</h1>
			</c:if>
		<c:if test="${(id=='hong') && (name=='홍길동')}">
			<h1>아이디는 ${id }이고, 이름은 ${name }입니다.</h1>
			</c:if>
		<c:if test="${age==25 }">
			<h1>${name }의 나이는 ${age }살입니다.</h1>
			</c:if>
		<c:if test="${height>160 }">
			<h1>${name }의 키는 160보다 큽니다.</h1>
			</c:if>
		 <%-- <c:choose></c:choose> 사용  --%>
	
		<c:choose>
			<%-- <c:when test="${name==null }"> --%>
			<c:when test="${empty name }">
				<tr align="center">
					<td colspan=5> 이름을 입력하세요!!</td>
				</tr>
			</c:when>
			<c:otherwise>
				<tr align="center">
					<td>${id }</td>
					<td>${pwd }</td>
					<td>${name }</td>
					<td>${age }</td>
					<td>${height }</td>
				</tr>
			</c:otherwise>
		</c:choose>
		</table>
</body>
</html>