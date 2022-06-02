package Hello;
import java.util.Scanner;

public class JAVA_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 2개를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.print("둘 중에 큰 수는 : ");
		System.out.println(a > b ? a : a==b ? "같음": b);
		
		sc.close();
		
	}

}