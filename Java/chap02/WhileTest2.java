package chap02;
import java.util.Scanner;
public class WhileTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0, sum = 0, count = 0;
		float avg = 0.0F;
		while(count<5) {
			System.out.printf("점수입력: ");
			num = sc.nextInt();
			if(0<=num&&num<=100) {
			sum +=num; // sum= sum+num;
			count++;
			}
			else
				System.out.println("다시 입력하세요");
				
		
		}
		avg = sum/count;
		
		System.out.println("점수: "+num);
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
	}

}
