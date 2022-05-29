<%@page import="java.util.List"%>
<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("utf-8");
    %>
    <!-- m은 매개변수가 없는 생성자 메소드 호출 -->
    <jsp:useBean id="m" class="bean.MemberBean" scope="page" />
    <%	String id = request.getParameter("id");
    	String pwd = request.getParameter("pwd");
    	String name = request.getParameter("name");
    	String email = request.getParameter("email");
    //	MemberBean bean = new MemberBean(id, pwd, name, email); 
    	m.setId(id);
    	m.setPwd(pwd);
    	m.setName(name);
    	m.setEmail(email);
    	
    	MemberDAO dao = new MemberDAO();
    	List<MemberBean> list = dao.listMembers();
    	int res = dao.addMember(m); //결과 1또는 0
    	String msg="", url="#";
    	if(res==1){
    		msg = "회원가입 성공";
    		url = "/pro12/member/login.html";
    %>
    	<script>
    		alert("<%=msg %>");
    		<%-- location.href = "<%=url%>"; --%>
    		self.close();
    	</script>
    <%	}else {
    		msg = "회원가입 실패 , 회원가입 페이지로 이동";
    		url = "/pro12/member/memberForm.html";
    	%>
    	<script>
    		alert("<%=msg %>");
    		location.href ="<%=url %>";
    		self.close();
    	</script>
    	<%} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록창</title>
</head>
<body>
	<table align="center" width=100%>
		<tr align="center" bgcolor="#99ccff">
			<td width="7%">아이디</td>
			<td width="7%">비밀번호</td>
			<td width="5%">이름</td>
			<td width="11%">이메일</td>
			<td width="5%">가입일</td>
		</tr>
		<%if (list.size()==0){ %>
		<tr>
			<td coilspan="5">
				<p align="center"><b><span style="font-size:9pt;">
					등록된 회원이 없습니다.</span></b></p>
			</td>
		</tr>
		<%}else { 
			for( int i = 0; i<list.size(); i++){
				MemberBean beanM = (MemberBean)list.get(i);
		%>
		<tr align="center">
			<td>
			<%=beanM.getId() %>
			</td>
			<td>
			<%=beanM.getPwd() %>
			</td>
			<td>
			<%=beanM.getName() %>
			</td>
			<td>
			<%=beanM.getEmail() %>
			</td>
			<td>
			<%=beanM.getJoinDate() %>
			</td>
		</tr>
			<%
			}//end for
		}//end if
			%>
			<tr height="1" bgcolor="#99ccff">
				<td colspan="5"></td>
			</tr>
	</table>
</body>
</html>