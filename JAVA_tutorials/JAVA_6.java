package Hello;
import java.util.Scanner;

public class JAVA_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("좋아하는 동물은?");
		String animal = sc.next();		
		System.out.println("당신의 취미는?");
		sc.nextLine();
	    String hobby = sc.nextLine();
	   
		System.out.printf("당신의 이름은 %s 입니다 \n나이는 %d 살이며 \n좋아하는 동물은 %s 입니다"
				+ "\n취미는 %s 이군요", name, age, animal, hobby);
		
	    sc.close();

	}

}