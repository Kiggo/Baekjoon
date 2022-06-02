package chap03;
import java.util.Scanner;
public class ArrayMaxMin {

	public static void main(String[] args) {
		int [] ArrayM = new int[5]; //배열 크기 선언
		Scanner sc =  new Scanner(System.in); //배열에 입력
		
		for(int i = 0; i<ArrayM.length; i++) {
			System.out.printf("입력하세요: ");
			ArrayM[i] = sc.nextInt(); //입력받은 정수 배열에 저장
		}
		int max = ArrayM[0];
		int min = ArrayM[0];
		
		for(int i = 1; i < ArrayM.length; i++) {
		    // i가 1부터 시작인 이유는 max와 min의 값에 [0]을 지정해주었기때문
			if(max<ArrayM[i])  //가장 큰수와 비교
				max = ArrayM[i]; //max에 저장
	
		
			if(min>ArrayM[i]) //가장 작은수 비교
				min = ArrayM[i]; //min에 저장
		
			
	}
		System.out.println("max= "+ max);
		System.out.println("min= "+ min);
		 
		
	}

}
