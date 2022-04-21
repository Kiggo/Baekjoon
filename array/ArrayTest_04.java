package array;

import java.util.Scanner;

public class ArrayTest_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[5];
		System.out.println("5개의 정수 입력");
		int maxNum = arr[0];
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>maxNum)
				maxNum=arr[i];
		}
		System.out.println("가장 큰 수 : "+maxNum);
	}
}
