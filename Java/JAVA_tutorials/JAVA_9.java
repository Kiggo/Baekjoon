package Hello;
import java.util.Scanner;

public class JAVA_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("==== 개발자 MBTI 결과 보기====\n당신의 MBTI를 입력하세요: ");
		String a = sc.next();

		switch (a) {
		case "INTP","intp":
			System.out.println("당신은 백엔드형 입니다!");
			break;
		case "ENFJ","enfj":
			System.out.println("당신은 프론트엔드형 입니다!");
			break;
		case "INFJ","infj":
			System.out.println("당신은 풀스택형 입니다!");
			break;
		case "ISTJ","istj":
			System.out.println("당신은 퍼블리셔형 입니다!");
			break;
		case "ENTJ","entj":
			System.out.println("당신은 아키텍쳐형 입니다!");
			break;
		case "ISFJ","isfj":
			System.out.println("당신은 보안전문가형 입니다!");
			break;
		case "INTJ","intj":
			System.out.println("당신은 데이터분석가형 입니다!");
			break;
		case "ENFP","enfp":
			System.out.println("당신은 AI형 입니다!");
			break;
		case "ENTP","entp":
			System.out.println("당신은 IOS형 입니다!");
			break;
		case "ESFJ","esfj":
			System.out.println("당신은 안드로이드형 입니다!");
			break;
		case "ESFP","esfp":
			System.out.println("당신은 게임 개발자형 입니다!");
			break;
		case "ESTP","estp":
			System.out.println("당신은 IoT 개발형 입니다!");
			break;
		case "ESTJ","estj":
			System.out.println("당신은 QA 형 입니다!");
			break;
		case "INFP","infp":
			System.out.println("당신은 블록체인형 입니다!");
			break;
		case "ISTP","istp":
			System.out.println("당신은 임베디드 개발자형 입니다!");
			break;
		case "ISFP","isfp":
			System.out.println("당신은 네트워크 개발자형 입니다!");
			break;
		default:
			System.out.println("정확한 MBTI 유형이 아니네요 ㅠㅠ");
		}

	sc.close();
		
	}
}