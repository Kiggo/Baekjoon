import java.util.Scanner;

public class _2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = a*b*c;
		int n=0, temp=0;
		
		temp=num;
		
		while(temp!=0) {
			n++;
			temp=temp/10;
		}
		int[]arr = new int[n];
		int[]count = new int [10];
		
		temp=num;
		for(int i = arr.length-1; i>=0; i--) {
			arr[i]=temp%10;
			temp=temp/10;
		}
		for(int i =0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		for(int i = 0; i<count.length; i++)
		System.out.println(count[i]);
	}
}


