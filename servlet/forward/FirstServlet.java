package servlet.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//respnse.sendRedirect("second");    //1. sendRedirect()사용
		//response.addHeader("Refresh","3;url=second");// 2. addHeader()사용
		//3. location 사용
		//out.print("<script>");
		//out.print("location.href='second';");
		//out.print("</script>");
		//4. redirect 사용
		//response.sendRedirect("second?name=jsp");
		//5. dipatch 사용
		RequestDispatcher dispatch = request.getRequestDispatcher("second?name=jsp");
		dispatch.forward(request, response);
	}
}
