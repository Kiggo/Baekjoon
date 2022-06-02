package chap01;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HelloWorld Java!!!!");
		System.out.println(12345);
		System.out.println(100+200);
		System.out.println(100/200);
		System.out.println(100*200);
	    /////////////////////////////////////////////
		System.out.println("변수 선언");
		int a=0;
		int x,y;//4byte
		long lnum=0L;
		float fNum=0.0F; //4byte
		double dNum=0.0; //8byte
		System.out.println("a="+a);
		System.out.println("a="+fNum+fNum);
		a=100;
		a=200;
		a=(int)500.12;
		a=a+100; //a+=100;
		int num1=100,num2=100;
		System.out.println("a="+a);
		String name ="홍길동";
		String address="대전시 서구";
		boolean isBoolean=true;
		address="대전 서구 용문동";
		String address2="대전시 서구";
		System.out.println("이름:"+name+"의 실제 주소 "+address+"입니다.");
		System.out.println(isBoolean+"의 실제 주소 입니다");
		
		System.out.println(num1==num2);//값
		System.out.println(address==address2);
		System.out.println(address.contentEquals(address2));
		fNum=1000;
		System.out.println("fNum="+fNum);
	}
	
}
