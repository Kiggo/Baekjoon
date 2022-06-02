package chap02;

import java.util.Scanner;

public class Iftest3 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double maxNum;
		
		System.out.println("실수 세수를 입력: ");
		double num1,num2,num3;
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		num3=sc.nextDouble();
		
		maxNum=num1; //가장 큰 수로 가정
		if(num2>maxNum)
			maxNum=num2;
		if(num3>maxNum)
			maxNum=num3;
	
		
		System.out.printf("MaxValue=%.2f",maxNum);
		System.out.println("MaxValue="+maxNum);
 }
}
