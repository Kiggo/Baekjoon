

import java.util.Scanner;

public class _2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[9];
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==max)
				System.out.println(i+1);
		}
	}
}
