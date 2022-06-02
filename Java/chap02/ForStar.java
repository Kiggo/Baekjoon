package chap02;

import java.util.Random;

public class ForStar {
	
	public static void main(String[] args) {
		int height = 5;
		for(int i = 1; i <= height; i++) {
			for(int j = 0; j < i; j++) {  // i = 0 일때 j <= i  0 <= 0 0 "*"
										  // i = 1 일때 j <= i  0 <= 1 0,1 "**"
									 	  // i = 2 일때 j <= i  0 <= 2 0,1,2 "***"
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		Random random = new Random(System.currentTimeMillis());
		int face;
		for(int i = 1; i <= 20; i++) {
		face = 1+random.nextInt(6);
		System.out.printf("%5d",face);
			if(i%5==0)
				System.out.println();
		}
		
		System.out.println();
		// 수 를 교환
		int num1 = 100, num2 = 200, temp = 0;
		
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		System.out.println();
		
	}
}
