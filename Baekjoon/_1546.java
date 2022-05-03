
import java.util.Scanner;

public class _1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int [sc.nextInt()];
		int max = arr[0];
		double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i = 0; i<arr.length; i++) {
			double a = ((double)arr[i]/max)*100;
			sum=sum+a;
		}
		System.out.println(sum/arr.length);
	}
}
