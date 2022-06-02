package chap04;

public class Method4 {
	public int summarize(int a, int b) {
		int sum = 0 ;
		for(int i = a; i<=b; i++)
			sum+=i;
		
		System.out.printf("%d에서 %d까지 합은 %d",a,b,sum);
		return sum;
	}
	public static void main(String[] args) {
		Method4 m = new Method4();
		int sum = m.summarize(1, 100);
		//평균
		int avg = sum/2;
		System.out.println("평균 = "+avg);
	}
}
