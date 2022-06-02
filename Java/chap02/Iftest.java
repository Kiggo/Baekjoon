package chap02;

public class Iftest {

	public static void main(String[] args) {

		int a = 6, b = 5, c = 0;
		String str="";
		if (a > b) {
		System.out.println("a>b");
		System.out.println("a의 값은 6입니다");
		}
		if (a == 4)
		System.out.println("a의 값은 4입니다");
		if (a == b)
		System.out.println("a와 b는 같지 않다");
		
		if(a%2==1)
			str = a+"홀수";
		else
			str = a+"짝수";
		System.out.println(a+"은"+str);
	}	
}

