package chap01;

public class Operator3 {

	public static void main(String[] args) {
		int a = 0;
		int b = 10;
		int c = 0;
		
		System.out.println((a!=0)&&((c=b) > 20));
		System.out.println("c= "+c);
		System.out.println((a!=0)&((c=b) > 20));
		System.out.println("c= "+c);
		
		c=0;
		System.out.println((a==0)||((c=b) > 20));
		System.out.println("c= "+c);
		
		System.out.println((a==0)|((c=b) > 20));
		System.out.println("c= "+c);
	}

}
