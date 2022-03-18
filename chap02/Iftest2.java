package chap02;

import java.util.Scanner;

public class Iftest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요\n1.자바, 2.JSP, 3.C#, 4.C++");
		System.out.printf("과목선택: ");
		int num = sc.nextInt();
		String subject = "";
		if (num == 1)
			subject = "자바";
		else if (num == 2)
			subject = "JSP";
		else if (num == 3)
			subject = "C#";
		else if (num == 4)
			subject = "C++";
		else
			subject = "잘못 선택하셨습니다.";
		System.out.println("선택과목: " + subject);

		sc.close();

	}

}
