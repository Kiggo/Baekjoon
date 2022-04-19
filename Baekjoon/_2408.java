package baekjoon;

import java.util.Scanner;

public class _2408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		if(b>max)max=b;
		if(c>max)max=c;
		
		
		if(a==b&&b==c&&a==c) { 
				System.out.println(10000+a*1000);
		}
			else if(a==b&&b!=c) {
				System.out.println(1000+a*100);
			}else if(b==c&&c!=a) {
				System.out.println(1000+b*100);
			}else if(c==a&&a!=b) {
				System.out.println(1000+c*100);
			}
		else {
			System.out.println(max*100);
		}
		
	}
}
