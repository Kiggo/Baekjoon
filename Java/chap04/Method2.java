package chap04;

import java.util.Scanner;

public class Method2 {
	public static void main(String[] args) {
		int num1,num2,res = 0;
		char op=' ';
		System.out.print("num1 = ");
		num1=getInt();
		do {
		System.out.print("(+,-,*,/,%) = ");
		op=getChar();
		}while(op!='+'&&op!='-'&&op!='*'&&op!='/'&&op!='%');
		System.out.print("num2 = ");
		num2=getInt();
		switch (op) {
		case '+':
			res=plus(num1,num2);
			break;
		case '-':
			res=minus(num1,num2);
			break;
		case '*':
			res=multifly(num1,num2);
			break;
		default:
			
			break;
		}
		display(num1,op,num2,res);
	}
	public static int getInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static char getChar() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().charAt(0);
	}
	public static int plus(int num1,int num2) {
		return num1+num2;
	}
	public static int minus(int num1,int num2) {
		return num1-num2;
	}
	public static int multifly(int num1,int num2) {
		return num1*num2;
	}
	public static void display(int num1, char op, int num2, int res) {
		System.out.println(num1+" "+op+" "+num2+" = "+res);
		System.out.printf("%d %c %d = %d\n",num1, op, num2, res);
}
}

