package chap02;

import java.util.Scanner;

public class Iftest5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		int i = score/10;
		String str = "";
		if(score>=0 && score<=100) {
		if(i>=9)
			str="학점=A";
		else if (i==8)
			str="학점=B";
		else if (i==7)
			str="학점=C";
		else if (i==6)
			str="학점=D";
		else
			str="학점=F";
		System.out.println(str);
		
		}else
			System.out.println("잘못입력했습니다.");
	}
		

}
