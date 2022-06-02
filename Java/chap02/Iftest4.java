package chap02;
import java.util.Scanner;
public class Iftest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int code,num;
		String res="";
		
		System.out.println("1. 상품 1000원, 2. 상품 2000원, 3. 상품 3000원");
		System.out.printf("상품번호: ");
			code = sc.nextInt();
		System.out.printf("판매수량: ");
			num = sc.nextInt();
		
		if (code==1) 
		    res="상품번호: "+code+" 매출 "+(num*1000);
		else if (code==2)
			res="상품번호: "+code+" 매출 "+(num*1500);
		else if (code==3)
			res="상품번호: "+code+" 매출 "+(num*2000);
		else
			res="해당 코드 없음";
		System.out.println(res);
	}

}
