package Hello;
import java.util.Scanner;

public class JAVA_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("==== ������ MBTI ��� ����====\n����� MBTI�� �Է��ϼ���: ");
		String a = sc.next();

		switch (a) {
		case "INTP","intp":
			System.out.println("����� �鿣���� �Դϴ�!");
			break;
		case "ENFJ","enfj":
			System.out.println("����� ����Ʈ������ �Դϴ�!");
			break;
		case "INFJ","infj":
			System.out.println("����� Ǯ������ �Դϴ�!");
			break;
		case "ISTJ","istj":
			System.out.println("����� �ۺ����� �Դϴ�!");
			break;
		case "ENTJ","entj":
			System.out.println("����� ��Ű������ �Դϴ�!");
			break;
		case "ISFJ","isfj":
			System.out.println("����� ������������ �Դϴ�!");
			break;
		case "INTJ","intj":
			System.out.println("����� �����ͺм����� �Դϴ�!");
			break;
		case "ENFP","enfp":
			System.out.println("����� AI�� �Դϴ�!");
			break;
		case "ENTP","entp":
			System.out.println("����� IOS�� �Դϴ�!");
			break;
		case "ESFJ","esfj":
			System.out.println("����� �ȵ���̵��� �Դϴ�!");
			break;
		case "ESFP","esfp":
			System.out.println("����� ���� �������� �Դϴ�!");
			break;
		case "ESTP","estp":
			System.out.println("����� IoT ������ �Դϴ�!");
			break;
		case "ESTJ","estj":
			System.out.println("����� QA �� �Դϴ�!");
			break;
		case "INFP","infp":
			System.out.println("����� ���ü���� �Դϴ�!");
			break;
		case "ISTP","istp":
			System.out.println("����� �Ӻ���� �������� �Դϴ�!");
			break;
		case "ISFP","isfp":
			System.out.println("����� ��Ʈ��ũ �������� �Դϴ�!");
			break;
		default:
			System.out.println("��Ȯ�� MBTI ������ �ƴϳ׿� �Ф�");
		}

	sc.close();
		
	}
}