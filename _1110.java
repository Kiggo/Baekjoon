package baekjoon;

import java.util.Scanner;

public class _1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		
		int num = sc.nextInt();
		a=num/10;
		b=num%10;
		
		System.out.println(a+" + "+b+" = "+(a+b));//2 6
		System.out.println(b+""+(a+b));
		System.out.println(b+" + "+(a+b)+" = "+(a+b+b)); //6  8
		c=(b+a+b)%10; //4
		System.out.println((a+b)+""+c);
		System.out.println((a+b)+" + "+c+" = "+(a+b+c)); //12
		d=(a+b+c)%10; //2
		System.out.println();
		System.out.println(c+""+d); //c=4 d=2
		System.out.println(c+d);
		System.out.println(d+""+(c+d));
	}
}
