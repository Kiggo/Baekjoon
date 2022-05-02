import java.util.Scanner;

public class _3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int [10];
		boolean bool;
		int count = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt() % 42;
		}
		for(int i = 0; i<arr.length; i++) {
			bool=false;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					bool=true;
					break;
				}
			}
			if(bool==false) {
				count++;
			}
		}
			System.out.println(count);
	}
}