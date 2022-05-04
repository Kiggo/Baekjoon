import java.util.Scanner;

public class _4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 5
		int sum = 0;
		int count = 0;
		int avg = 0;
		for(int i = 0; i<a;i++) {
			int[] arr = new int[sc.nextInt()];//5
			for(int j = 0; j<arr.length; j++) {
				arr[j]=sc.nextInt(); // 50 50 70 80 100
				sum=sum+arr[j]; // 총합 350
			}
			avg=sum/arr.length;
			for(int j = 0; j<arr.length; j++) {
				if(avg<arr[j])
					count++;
			}
			System.out.println(String.format("%.3f", (double)count/arr.length*100)+"%");
			sum=0;
			count=0;
		}
	}
}
