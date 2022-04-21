package baekjoon;

import java.util.Scanner;

public class _1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int num = sc.nextInt();
		int count = 0;
		
		int a=num/10;
		int b=num%10;
		while(true) {
			int sum=(b*10)+(a+b)%10;
			//System.out.println(a+" + "+b+" = "+(a+b));//2 + 6 = 8
			//System.out.println(sum); //6 8
			a=sum/10; //6
			b=sum%10; //8
			count++;
			if(num==sum)
				break;
		}
		System.out.println(count);
	}
}
		
	

