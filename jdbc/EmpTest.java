package jdbc;

public class EmpTest {
	public static void main(String[] args) {
		EmpVO vo = new EmpVO();//매개변수없음
		vo.setEmpno(12345);
		vo.setEname("java");
		vo.setSal(3500.);
		int empno1 = vo.getEmpno();
		String ename1 = vo.getEname();
		double sal1 = vo.getSal();
		//////////////////////
		EmpVO vo2 = new EmpVO(23456,"jdbc",2500);  //매개변수있음
		int empno = vo2.getEmpno();
		String ename = vo2.getEname();
		double sal = vo2.getSal();
		System.out.println(empno+","+ename+","+sal);
		vo2.setSal(3000);
		sal=vo2.getSal();
		System.out.println(empno+","+ename+","+sal);
	}
}
