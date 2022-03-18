package chap02;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, n, sum = 0;
		System.out.print("첫번째 수 = ");
		num1=sc.nextInt();
		System.out.print("두번째 수 = ");
		num2=sc.nextInt();
		System.out.print("배수 = ");
		n=sc.nextInt();
		if(num1>num2) {
			//교환
		int temp=num1;
			num1=num2;
			num2=temp;
			//교환
		}
		for(int i = num1; i<=num2; i++) {
			if(i%n==0) 
				sum+=i;
			}
			System.out.println(num1+" 에서 "+num2+" 사이의 배수의 합: "+sum);
		}
		
	}


