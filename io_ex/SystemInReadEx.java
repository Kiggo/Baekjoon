package io_ex;

import java.io.IOException;

public class SystemInReadEx {
	public static void main(String[] args) throws IOException {
		/*
		System.out.print("값을 입력하세요: ");
		char ch = (char)System.in.read(); // 아스키 코드 값으로 출력
		System.out.println(ch); 
		System.in.read();
		System.in.read();
		*/
		System.out.print("숫자 입력: ");
		int num1 = System.in.read();
		System.in.read(); //엔터값 처리해준다 13과 10번 
		System.in.read();
		
		System.out.print("숫자 입력: ");
		int num2 = System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("숫자 입력: ");
		int num3 = System.in.read();
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("num3 = "+num3);
	}
}
