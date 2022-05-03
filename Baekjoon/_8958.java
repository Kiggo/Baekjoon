import java.util.Scanner;

public class _8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		String o = "O";
		int num = sc.nextInt();
		for(int j = 0; j<num; j++) {
			
		String str = sc.next();
		String[]arrSplit = str.split("");
		
		for(int i = 0; i<str.length(); i++) {
				if(arrSplit[i].equals(o)) {
					count++;
					sum=sum+count;
				}else
					count=0;
			}
		System.out.println(sum);
		sum = 0;
		count = 0;
		}
	}
}
