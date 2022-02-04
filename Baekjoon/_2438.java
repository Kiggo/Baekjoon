import java.util.Scanner;
public class _2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = "*";
		for(int i = 1; i <= a; i++) {
			System.out.println(b);
			b+="*";
			
		}
		sc.close();

	}

}
