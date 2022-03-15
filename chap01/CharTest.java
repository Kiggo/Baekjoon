package chap01;

public class CharTest {

	public static void main(String[] args) {
		char ch='a';
		int num = 97;
		char ch2='A';
		
		System.out.println("cs의 값:"+ch+", 아스키:"+(int)ch);
		ch='a'+1;
		System.out.println("cs의 값:"+ch+", 아스키:"+(int)ch);
		System.out.println("num의 값:"+num+", 문자:"+(char)num);
		System.out.println("A="+(int)ch2);
		////////////////////////////////////
		char ch3='h'; //h= 104
		char ch4='e';
		char ch5='l';
		
		System.out.println(ch3+""+ch4+""+ch5);
		System.out.print(ch3);
		System.out.print(ch4);
		System.out.print(ch5);
		System.out.println();
		System.out.println((char)(ch3-32)+""+
						   (char)(ch4-32)+""+
						   (char)(ch5-32));
		
		System.out.println("번호\t이름\temail\t주소");
		System.out.println("자바\n자료변환");
		//////////////////////////////////////
		
		byte b = 100; 
		short s = 200;
		int num2 = 250000;
		System.out.println("b의 값은 "+b+"\ns의 값은"+s+"\nnum의 값은 "+num2);
		b = (byte)(100+100);
		s= (short)(32767+1);
		
		System.out.println("b="+b+"\n"+"s="+s);
	}
	
	

}
