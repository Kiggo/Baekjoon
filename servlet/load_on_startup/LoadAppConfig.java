package servlet.load_on_startup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "/loadAppConfig", urlPatterns = { "/loadConfig" }, loadOnStartup = 1) // loadOnStatup속성을 추가하고 우선순위를 1로 설정
public class LoadAppConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context; // 변수 context를 멤버 변수로 선언
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoadAppConfig의 init 메소드 호출");
		context = config.getServletContext(); // init() 메소드에서 ServletContext 객체를 얻는다
		String menu_member = context.getInitParameter("menu_member"); // getInitParameter()에소드로 web.xml의
		String menu_order = context.getInitParameter("menu_order");   // 메뉴 정보를 읽어들인다
		String menu_goods = context.getInitParameter("menu_goods");
		context.setAttribute("menu_member", menu_member); // 메뉴 정보를 ServletContext 객체에 바인딩한다
		context.setAttribute("menu_order", menu_order);
		context.setAttribute("menu_goods", menu_goods);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//ServletContext context = getServleContext(); doGet() 메소드 호출 시 ServletContext 객체를 얻는 부분은 주석 처리
		String menu_member = (String) context.getAttribute("menu_member"); // 브라우저에서 요청 시 ServleContext 객체의
		String menu_order = (String) context.getAttribute("menu_order");   // 바인딩된 메뉴 항목을 가져온다
		String menu_goods = (String) context.getAttribute("menu_goods");
		out.print("<html><body>");
		out.print("<table border=1 cellspacing=0><tr>메뉴 이름</tr>");
		out.print("<tr><td>"+menu_member+"</td></tr>");
		out.print("<tr><td>"+menu_order+"</td></tr>");
		out.print("<tr><td>"+menu_goods+"</td></tr>");
		out.print("</table></body></html>");
	}

}
