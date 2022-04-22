package baekjoon;

import java.util.Scanner;

public class _10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int [sc.nextInt()];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int maxNum=arr[0], minNum=arr[0];
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]>maxNum)
				maxNum=arr[i];
			
			if(arr[i]<minNum)
				minNum=arr[i];
		}
			
			System.out.println(minNum+" "+maxNum);
			
	}
}
