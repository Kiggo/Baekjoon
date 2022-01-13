package Hello;
import java.util.Scanner;

public class JAVA_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		while (true) {
	try {
			System.out.print("숫자를 입력하세요: ");
			int i = sc.nextInt();
			System.out.println(value[i]);
		  }
		
    catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("0부터 9사이의 값을 입력하세요");
          }
			sc.close();
	      }
	  }
}
		
		