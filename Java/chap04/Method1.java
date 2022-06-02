package chap04;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {

		printLine("=");
		printName("Hello",23); // 인자 : Hello 전달
		printLine("*");
		printName("Java",25);
		printLine("%");
		printName("DB",26);
		printLine("@");
		printName("korea",31);
		printLine("!");
		printName("Spring",35);
		int num1, num2;
		//두수를 입력받음 메소드는 결과 값(1개)만 반환 한다
		System.out.print("num1 = ");
		num1=getInt(); //sc.nextInt();
		System.out.print("num2 = ");
		num2=getInt();
		int sum = add(num1,num2);
		double div = divide(12.34,45.67);
		String lang = "Java Programming";
		String java = "Java";
		System.out.println("합  = "+sum);
		System.out.printf("합  = %d\n",sum);
		System.out.printf("합  = %5d\n",sum);
		System.out.printf("합  = %-5d\n",sum);
		System.out.printf("나누기  = %.2f\n",div);
		System.out.printf("%s\n","Java Programming");
		System.out.printf("%s\n",lang);
		System.out.printf("%30s\n",java);
		System.out.printf("%-30s\n",java);
		System.out.printf("%s\n",java);
	}
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	public static int add(int num1, int num2) {
		return num1+num2; // return 수식, 값
	}
	public static double divide(double num1, double num2) {
		return num1/num2;
	}
	public static void printLine(String srt) {
		for(int i = 1 ; i<= 20; i++)
		System.out.print(srt);
		System.out.println();
	}
	public static void printName(String name, int num) {
		System.out.println(name+","+num);
	}

}
