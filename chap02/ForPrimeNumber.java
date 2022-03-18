package chap02;
import java.util.Scanner;
public class ForPrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num; 
		System.out.println("소수인지 아닌지 판단하는 프로그램");
		System.out.printf("값 입력: ");
		num=sc.nextInt();
		for(int i = 2; i<num; i++) {
			if(num%i==0) {
				System.out.println(num+"은 소수가 아닙니다.");
				System.exit(0);
			}
		}
		System.out.println(num+"은 소수 입니다.");
	}

}
