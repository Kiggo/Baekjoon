package array;

import java.util.Scanner;

public class ArrayTest_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[5];
		
		System.out.println("5개의 수를 입력하세요...");
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		int maxNum=arr[0], minNum=arr[0];
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]>maxNum) 
				maxNum=arr[i];
			
			if(arr[i]<minNum)
				minNum=arr[i];
		}
		
		System.out.println("최대 값 : "+maxNum);
		System.out.println("최소 값 : "+minNum);
	}
}
