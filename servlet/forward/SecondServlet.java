package servlet.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//1.sendRedirect
		//out.print("<html><body>");
		//out.print("sendRedirect를 이용한 redirect 실습입니다.");
		//out.print("</body></html>");
		//2.addHeader
		//out.print("<html><body>");
		//out.print("Refresh를 이용한 redirect 실습입니다.");
		//out.print("</body></html>");
		//3.location href
		//out.print("<html><body>");
		//out.print("location을 이용한 redirect 실습입니다.");
		//out.print("</body></html>");
		//4.redirect 사용
		// ? --> request.getParameter();
		//String name = request.getParameter("name");
		//out.print("<html><body>");
		//out.print("이름: "+name);
		//out.print("</body></html>");
		//5.dispatch
		String name = request.getParameter("name");
		out.print("<html><body>");
		out.print("dispatch를 이용한 forward 실습입니다.");
		out.print("<br>");
		out.print("이름: "+name);
		out.print("</body></html>");
	}
}
