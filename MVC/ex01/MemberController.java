package sec01.ex01;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MemberBean;
import dao.MemberDAO;

@WebServlet("/mem.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberDAO memberDAO;
	
	public void init(ServletConfig config) throws ServletException {
		memberDAO = new MemberDAO();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandler(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandler(request,response);
	}
	
	private void doHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.데이터 출력(listMember.do)
		//2.member추가 화면 출력(memberForm.do)
		//3.추가된 내용을 DB로 저장(addMember.do)
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		List<MemberBean> membersList = memberDAO.listMembers();
		//request.setAttribute("mvc", "mvc TEst!!!");
		request.setAttribute("membersList", membersList);
		RequestDispatcher dispatch = request.getRequestDispatcher("/test01/listMembers.jsp");
		dispatch.forward(request, response);
	}

}
