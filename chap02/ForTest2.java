package chap02;

public class ForTest2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 50; i++) {
			if(i%5==0) {
				System.out.print(i+"");
				sum+=i;
		}
	}
		System.out.println();
		System.out.println("1-50까지 5의 배수 합: "+sum);
	}

}
