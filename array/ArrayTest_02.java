package array;

import java.util.Scanner;

public class ArrayTest_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = {100,200,300};
		int num1 = sc.nextInt();
		
		for(int i = 0; i<arr.length; i++) 
			System.out.println(arr[i]);
			
			//키보드로 부터 값을 입력 받기 
		for(int i = 0; i<arr.length; i++) 
			arr[i]=sc.nextInt();
		
		for(int i = 0; i<arr.length; i++) 
			System.out.println(arr[i]);
	}
}
