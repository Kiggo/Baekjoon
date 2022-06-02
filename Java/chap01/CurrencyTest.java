package chap01;

public class CurrencyTest {

	public static void main(String[] args) {
		int won = 354000;
		int rate = 1120;
		float dollar;
		
		dollar = won/rate; //정수만 리턴한다 (소수부는 버림)
		System.out.println(won+"원 에 대한 달러는 :"+dollar+" 달러");
		
		dollar = (float)won/(float)rate;
		System.out.println(won+"원 에 대한 달러는 :"+dollar+" 달러");
		
		dollar = (float) won/rate;
		System.out.println(won+"원 에 대한 달러는 :"+dollar+" 달러");
		
		//won = dollar*rate;
		won = (int)dollar*rate;
		System.out.println(dollar+"달러에 대한 원은:"+won+"원");
		won = (int)(dollar*rate);
		System.out.println(dollar+"달러에 대한 원은:"+won+"원");
	}

}
