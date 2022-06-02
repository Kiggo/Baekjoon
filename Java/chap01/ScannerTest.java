package chap01;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두번재 수를 입력하세요");
		int num2 = sc.nextInt();
		
		System.out.println("입력한 두수는 "+num1+","+num2);
		System.out.println("두수의 합은 "+(num1+num2));
		
		System.out.println("실수를 입력하세요");
		float f_num1 = sc.nextFloat();
		System.out.println("입력한 실수는 "+f_num1);
		
		System.out.println("이름을 입력하세요");
		sc.nextLine(); // 개행문자 입력처리 (\n\r)
		
		String name = sc.nextLine();
		System.out.println("이름은 "+name);
	}

}
