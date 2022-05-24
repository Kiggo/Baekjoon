package servlet.session.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/show")
public class ShowMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id ="", pwd="";
		Boolean isLogon=false;
		HttpSession session = request.getSession(false); // 이미 세션이 존재하면 세션을 반환하고, 없으면 null을 반환합니다.
		if(session!=null) { // 먼저 세션이 생성되어 있는지 확인합니다.
			isLogon=(Boolean)session.getAttribute("isLogon"); // isLogOn속성을 가져와 로그인 상태를 확인합니다.
			if(isLogon==true) { // isLogOn이 true면 로그인 상태이므로 회원 정보를 브라우저에 표시합니다.
				id = (String)session.getAttribute("login.id");
				pwd = (String)session.getAttribute("login.pwd");
				out.print("<html><body>");
				out.print("아이디: "+id+"<br>");
				out.print("비밀번호: "+pwd+"<br>");
				out.print("</body></html>");
			}else {
				response.sendRedirect("login3.html"); // 로그인 상태가 아니면 로그인 창으로 이동합니다.
			}
		}else {
			response.sendRedirect("login3.html"); // 세션이 생성되지 않았으면 로그인 창으로 이동시킵니다
		}
	}

}
