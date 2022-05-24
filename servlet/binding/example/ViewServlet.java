package servlet.binding.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewMembers")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		List list = (List) request.getAttribute("membersList");
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>");
		
		for (int i = 0; i<list.size(); i++) {
			MemberVO vo = (MemberVO) list.get(i);
			out.print("<tr><td>"+vo.getId()+"</td><td>"+vo.getPwd()+"</td><td>"
					+vo.getName()+"</td><td>"+vo.getEmail()+"</td><td>"+vo.getJoinDate()+"</td><td>"
					+"<a href='/pro08/member?command=delMember&id="+vo.getId()+"'>삭제</a></td></tr>");
		}
		out.print("</table></body></html>");
		out.print("<a href='/pro08/memberForm.html'>새 회원 등록하기</a>");
	}
}
