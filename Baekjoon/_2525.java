package baekjoon;

import java.util.Scanner;

public class _2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = (b+c)%60;
		
			if(b+c>=60) {
				a+=(b+c)/60;
				if(a>=24)
					a=a-24;
				System.out.println(a+" "+(min));
			}else{
				System.out.println(a+" "+(min));
				}
			}
	}

