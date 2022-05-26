<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>include 지시어의 사용</h2>
<hr color=red>
<b> 아래 부분은 hello.jsp가 포함된 부분입니다.</b><br>
<hr color=green>
<%@ include file="hello.jsp" %>
<!-- include 지시어는 페이지의 소스를 포함시킨다.
반면, include액셔의 경우는 소스가 아닌 페이지의
실행결과를 포함시킨다. -->
<hr color=blue>
<jsp:include page="bottom.jsp"></jsp:include>