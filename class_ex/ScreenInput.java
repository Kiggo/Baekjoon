package class_ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScreenInput {
	
	public static int getNum() {
		int num = getInput();
		return num;
	}
	
	public static int getInput() {
		Scanner sc = null;
		int num=0;
		boolean bool;
		do {
			try {
				if(sc==null)
					sc = new Scanner(System.in);
					num=sc.nextInt();
					bool=false;
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력:"+e.getMessage());
				sc.nextLine();
				bool = true;
			}
		}while(bool); //문자 입력: true 숫자입력: false
		
		return num;
	}
}
