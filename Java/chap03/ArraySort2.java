package chap03;
import java.util.Scanner;
public class ArraySort2 {

	public static void main(String[] args) {
		
		int [] score = new int[10];
		int num = 0, avg = 0, max = 0, temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10개의 값을 입력해주세요.");
		
		for(int i = 0; i<score.length; i++) {
			System.out.print((i+1)+"번째 값: ");
			score[i] = sc.nextInt();
			num += score[i];
			if(max<score[i])
				max = score[i];
		}
			avg = num/score.length;
			
		System.out.println("*******************************************");
		System.out.println("Result");
		System.out.println("합산: "+num+" / 평균 : "+avg+" / 최대값: "+max);
		
		for(int i = 0; i<score.length; i++) {
			System.out.printf("%4d", score[i]);
		}
		System.out.println();
		System.out.println("==========================================");
		for(int i = 0; i<score.length; i++) { ///정렬된 기준 값
			for(int j = i+1; j<score.length; j++) { // 기준 값과 비교할 나머지 값들
				if(score[i]<score[j]) {  // i = 0 일때 if(score[0]<score[1])
					temp = score[i]; 	 // i = 0 일때 temp = score[0];
					score[i] = score[j]; // j = 1 일때  score[0] = score[1]; j=2 score[0] = score[2] 
					score[j] = temp;     // score[1] = score[0];
				}             			 // i = 1 일때 if(score[1]<score[2])
			}
		}
		for(int i = 0; i<score.length; i++) {
			System.out.printf("%4d", score[i]);
		}
	}

}
