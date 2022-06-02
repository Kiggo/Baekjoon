package chap01;

public class FormatTest {

	public static void main(String[] args) {
		String sValue = "이순신";
		int nValue = 543;
		long lValue = 543L; //long 형 정수
		float fValue = 6.5e5f;
		double dValue = 7.654321e10d;
		
		System.out.printf("%s 입니다.\n", sValue);
		
		System.out.printf("%d\n", nValue);
		System.out.printf("%5d\n", nValue);
		System.out.printf("%05d\n", nValue);
		
		System.out.printf("%d\n", lValue);
		System.out.printf("%5d\n", lValue);
		System.out.printf("%05d\n", lValue);
		System.out.printf("%f\n", fValue);
		System.out.printf("%5.5f\n", fValue);
		System.out.printf("%05.05f\n", fValue);
		
		System.out.printf("%f\n", dValue);
		System.out.printf("%5.5f\n", dValue);
		System.out.printf("%05.05f\n", dValue);
	}
}
