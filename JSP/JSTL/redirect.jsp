<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <c:set var="contexPath" value="${pageContext.request.contextPath }" />
    <c:redirect url="/el.built_in_Object/member1.jsp" >
    	<c:param name="id" value="${'hong' }" />
    	<c:param name="pwd" value="${'1234' }" />
    	<c:param name="name" value="${'홍길동' }" />
    	<c:param name="email" value="${'hong@test.com' }" />
    </c:redirect>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <a href="${contextPath }/el.built_in_Object/member1.jsp">회원정보출력</a> --%>
	<a href="${url1 }">회원정보출력</a>
</body>
</html>