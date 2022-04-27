package jdbc;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpManager {
	EmpDAO dao;
	EmpVO vo;
	public EmpManager() {
		dao=new EmpDAO();
		vo=new EmpVO();
	}
	public void inputData() {
		//키보드에서 값을 입력
		System.out.print("사원번호:");
		vo.setEmpno(Menu.sc.nextInt());
		Menu.sc.nextLine();
		System.out.print("성 명:");
		vo.setEname(Menu.sc.nextLine());
		System.out.print("업 무:");
		vo.setJob(Menu.sc.nextLine());
		System.out.print("급 여:");
		vo.setSal(Menu.sc.nextDouble());
		
		int res = dao.insertEmp(vo);
		System.out.println("결과 값:"+res);
		if(res>0)
			System.out.println("자료 입력 성공");
		else
			System.out.println("자료 입력 실패");
	}
	
	public void writeAll() {
		ArrayList<EmpVO>lists = dao.searchEmp();
		System.out.println("전체 출력");
		Iterator<EmpVO> it = lists.iterator();
		while(it.hasNext()) {
			EmpVO vo = it.next();
			//String str = vo.toString(); // 객체를 문자열로 변환
			int empno = vo.getEmpno();
			String ename = vo.getEname();
			String job = vo.getJob();
			double sal = vo.getSal();
			//System.out.println(str);
			System.out.println(empno+"\t"+ename+"\t"+job+"\t"+sal);
		}
		
	}
	//이름으로 검색
	public void searchName() {
		System.out.print("이름: ");
		String name = Menu.sc.nextLine();
		ArrayList<EmpVO>lists = dao.getSearchName(name);
		Iterator<EmpVO> it = lists.iterator();
		while(it.hasNext()) {
			EmpVO vo = it.next();
			//String str = vo.toString(); // 객체를 문자열로 변환
			int empno = vo.getEmpno();
			String ename = vo.getEname();
			String job = vo.getJob();
			double sal = vo.getSal();
			//System.out.println(str);
			System.out.println(empno+"\t"+ename+"\t"+job+"\t"+sal);
			if(lists.size()==0)
				System.out.println("찾고자하는 데이터 없음");
		}
	}
	
	public void modifyData() {
		//사원번호 급여 업무를 변경한다	
		//키보드에서 값을 입력
		System.out.print("사원번호: ");
		//int empno = sc.nextInt();
		vo.setEmpno(Menu.sc.nextInt());
		Menu.sc.nextLine(); //개행문자 처리
		System.out.print("이름: ");
		vo.setEname(Menu.sc.nextLine());
		//String job = sc.nextLine();
		System.out.print("업무: ");
		vo.setJob(Menu.sc.nextLine());
		System.out.print("급여  :");
		//double sal = sc.nextDouble();
		vo.setSal(Menu.sc.nextDouble());
		boolean bool=dao.updateEmp(vo);
		if(bool)
			System.out.println("회원 변경 성공");
		else
		System.out.println("회원 변경 실패");

	}
	public void removeDate() {
		System.out.print("사원번호:");
		//int empno = sc.nextInt();
		vo.setEmpno(Menu.sc.nextInt());
		Menu.sc.nextLine();
		//int res = emp.deleteEmp(9999);
		boolean bool = dao.deleteEmp(vo);
		if(bool)
			System.out.println("데이터 삭제 성공");
		else
			System.out.println("데이터 삭제 실패");
	}
}
