package Hello;
import java.util.Scanner;

public class JAVA_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		System.out.println("�����ϴ� ������?");
		String animal = sc.next();		
		System.out.println("����� ��̴�?");
		sc.nextLine();
	    String hobby = sc.nextLine();
	   
		System.out.printf("����� �̸��� %s �Դϴ� \n���̴� %d ���̸� \n�����ϴ� ������ %s �Դϴ�"
				+ "\n��̴� %s �̱���", name, age, animal, hobby);
		
	    sc.close();

	}

}