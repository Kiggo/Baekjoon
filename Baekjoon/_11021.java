import java.util.Scanner;
public class _11021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int d = 1;
		for(int i=1; i<=a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println("Case #"+d+": "+(b+c));
			d++;
		}
		
		sc.close();

	}

}
