package stream_ex;

import java.util.stream.IntStream;

public class IntStreamEx {
	public static int sum;
	public static void main(String[] args) {
		
		IntStream stream = IntStream.rangeClosed(1, 100); // 정수형 for(int i = 1; i<=100; i++)
		stream.forEach(a-> sum += a);
		System.out.println("합: "+sum);
	}
}
