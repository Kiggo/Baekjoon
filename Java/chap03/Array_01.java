package chap03;

public class Array_01 {

	public static void main(String[] args) {
		int [] num = new int[5]; //new은 자동 초기화 시킴
		
		num[0]=100;
		num[1]=200;
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		//int a = 100; 1=500;
		num[0]=500;
		num[3]=123456;
		num[2]=num[0]+num[1];
		System.out.println("num[2 = "+ num[2]);
		System.out.println("num[0] = "+num[0]);
		int len = num.length;
		System.out.println("num의 크기 = "+len);
		System.out.println("num[2] = "+num[2]);
		System.out.println("num[3] = "+num[3]);
		System.out.println("num[4] = "+num[4]);
		
		int [] num2 = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i < num2.length; i++) 
		System.out.println("num["+i+"] = "+num2[i]);
		
		for(int i = 0; i < num2.length; i++)
			sum+=num2[i];
		System.out.println("배열의 합 = "+sum);
		System.out.println("배열의 주소 = "+num2);
		num2 = new int[3];
		for(int i = 0; i < num2.length; i++) 
		System.out.println("num["+i+"] = "+num2[i]);
		
		int kor = 100;
		System.out.println("kor = " +kor);
	}
}
