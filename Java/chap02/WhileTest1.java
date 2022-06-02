package chap02;

import java.util.Scanner;

public class WhileTest1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		String res = "";
		while (true) {
			System.out.printf("정수 입력: ");
			n = sc.nextInt();
			if (n == -999)
				break;
			if (n % 2 == 0) {
				res = n + "짝수";
			} else
				res = n + "홀수";
			System.out.println(res);
		}
		System.out.println("프로그램 종료!!!");
	}
}
