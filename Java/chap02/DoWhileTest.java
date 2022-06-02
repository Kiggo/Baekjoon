package chap02;

public class DoWhileTest {

	public static void main(String[] args) {
		int a = 0, sum = 0;
		
		do { sum+=a; System.out.println("do while 문 실행");
		  	System.out.println("sum = "+sum); a++; }while(a<5);
		 
		while(a<5) {
			sum+=a;
			System.out.println("while 문 실행");
			System.out.println("sum ="+sum);
			a++;
		}
		System.out.println("종료");
	}

}
