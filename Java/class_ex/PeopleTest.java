package class_ex;

import java.util.Scanner;

public class PeopleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		People p = new People();
		int res = p.cal();
		System.out.println(res);
		int result = 500+p.cal();
		System.out.println(result);
		result=0;
		result=p.minus();
		System.out.println(result);
		//두수 입력 받고 덧셈 add(num1,num2)
		int num1=0, num2=0;
		System.out.print("num1=");
		num1=ScreenInput.getNum();
		System.out.print("num2=");
		num2=ScreenInput.getNum();
		int resAdd = p.cal(num1,num2); //People 클래스의 cal (num1,num2) 메소드 호출
		System.out.println(resAdd);
		p.add(num1,num2);
	}
}
