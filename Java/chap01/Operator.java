package chap01;

public class Operator {

	public static void main(String[] args) {
		int var1 = 4;
		int sum = 6;

		sum += var1; //sum=sum+var1;
		System.out.println(sum);
		sum -= var1; //sum=sum-var1;
		System.out.println(sum);
		sum *= var1; //sum-sum*var1;
		System.out.println(sum);
		sum /= var1;
		System.out.println(sum);
		sum %= var1;
		System.out.println(sum);
	}

}
