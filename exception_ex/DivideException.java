package exception_ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0,res=0;
		boolean bool = false;
		
		while(true) { //정수가 입력되면 false, 문자 값을 입력하면 다시 입력 true
			do{
				try {
				System.out.print("num1 = ");
				num1 = sc.nextInt();
				bool = false;
				}catch(InputMismatchException e) {
					System.out.println("정수만 입력하세요...");
					sc.nextLine();
					bool = true;
				}
			}while(bool); // ture--> false
			do {
				try {
				System.out.print("num2 = ");
				num2 = sc.nextInt();
				bool = false;
				}catch(InputMismatchException e) {
					System.out.println("정수만 입력하세요...");
					sc.nextLine();
					bool = true;
				}
			}while(bool);
				try {
					res = num1/num2;
					System.out.println(num1+"/"+num2+" = "+res);
				}catch(ArithmeticException e) {
					System.out.println("0으로 나눌 수 없습니다");
					sc.nextLine();
					continue;
				}
					break;
		}
	}
}

