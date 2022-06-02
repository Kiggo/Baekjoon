package stream_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionsEx {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("이순신", 35),
				new Student("자바", 30)
				);
		
		Stream<Student> stream = list.stream(); // 스트림 얻기 
		stream.forEach(st -> {
			String name = st.getName(); //List 컬렉션에서 Student를 가져와 람다식의 매개값으로 제공
			int score = st.getScore();
			System.out.println(name+"-"+score);
		});
	}
}
