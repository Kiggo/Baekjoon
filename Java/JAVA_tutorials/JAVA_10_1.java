package Hello;
import java.util.Scanner;

public class JAVA_10_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		int a = sc.nextInt();
		int b = 0;
		for(int c = 0; c <= a; c++) {
			b += c;
		}
		
		System.out.println("1���� " + a + "���� ���� " + b + "�Դϴ�");
	    
		sc.close();
		
	}

}
