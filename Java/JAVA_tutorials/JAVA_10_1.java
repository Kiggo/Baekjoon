package Hello;
import java.util.Scanner;

public class JAVA_10_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int a = sc.nextInt();
		int b = 0;
		for(int c = 0; c <= a; c++) {
			b += c;
		}
		
		System.out.println("1부터 " + a + "까지 합은 " + b + "입니다");
	    
		sc.close();
		
	}

}
