package programmers;

import java.util.Scanner;

public class _12943 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		int answer = 0;
		
		while(true) {
			if(num==1) {
				answer=0;
				break;
			}
			answer++;
			if(num%2==0) 
				num = num /2 ;
			else 
				num = num*3+1;
			if(num==1)
				break;
			else if(answer>=500) {
				answer = -1;
				break;
			}
		}
		System.out.println(answer);
	}
}
