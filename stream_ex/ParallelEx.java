package stream_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"홍길동", "신용권", "김자바",
				"람다식", "박병철");
		
		//순차 처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelEx :: print); //메소드 참조(s->ParallelEx.print(s)와 동일)
		System.out.println();
		
		//병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelEx :: print); //메소드 참조
		
		}
	public static void print(String str) {
		System.out.println(str+" : "+Thread.currentThread().getName());
				
	}
}
