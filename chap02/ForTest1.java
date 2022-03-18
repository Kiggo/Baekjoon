package chap02;

public class ForTest1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i = 0; i < 5; i+=2) {
			sum+=i;
		}
		System.out.println("합 :"+sum);
	}

}
