package chap01;

public class Operator4 {

	public static void main(String[] args) {
		int a = 5, b = 5, c = 5;
		a++; //a+=1; a=a+1;
		++b;
		System.out.println("a++="+a);
		System.out.println("++b="+b);

		int y = c++; // 1.y=c; 2.c=c+1;
		System.out.println("y="+y);
		System.out.println("c="+c);
		
		int x = ++a; // 1.a=a+1; 2.x=a;
		System.out.println("++x="+x);
		System.out.println("++a="+a);
	}

}
