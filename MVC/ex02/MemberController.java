package sec02.ex02;

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

@WebServlet("/member/*")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberDAO memberDAO;
	
	public void init(ServletConfig config) throws ServletException {
		memberDAO = new MemberDAO();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.데이터 출력(listMember.do)
		//2.member추가 화면 출력(memberForm.do)
		//3.추가된 내용을 DB로 저장(addMember.do)
		String nextPage = null;
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getPathInfo();//url에서 요청명 가져옴
		System.out.println("action: "+action);
		if(action==null||action.equals("/listMembers.do")) {
			List<MemberBean> membersList = memberDAO.listMembers();
			request.setAttribute("membersList", membersList);
			nextPage="/test01/listMembers.jsp";
		}
		
		else if(action.equals("/addMember.do")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			MemberBean vo = new MemberBean(id,pwd,name,email);
			memberDAO.addMember(vo);
			nextPage="/member/listMembers.do";
		}
		
		else if(action.equals("/memberForm.do")) {
			nextPage="/test01/memberForm.jsp";
		}
		
		else if(action.equals("/modMemberForm.do")){
			String id = request.getParameter("id");
			MemberBean memInfo = memberDAO.findMember(id);
			request.setAttribute("memInfo", memInfo);
			nextPage="/test01/modMemberForm.jsp";
			
		}
		
		else if(action.equals("/modMember.do")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			MemberBean vo = new MemberBean(id,pwd,name,email);
			memberDAO.modMember(vo);
			request.setAttribute("msg", "modified");
			nextPage="/member/listMembers.do";
			
		}
		
		else if(action.equals("/delMember.do")) {
			String id = request.getParameter("id");
			memberDAO.delMember(id);
			request.setAttribute("msg", "deleted");
			nextPage="/member/listMembers.do";
		}
		
		else {
			List<MemberBean> membersList = memberDAO.listMembers();
			request.setAttribute("membersList", membersList);
			nextPage = "/test01/listMembers.jsp";
		}
		
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}

}
