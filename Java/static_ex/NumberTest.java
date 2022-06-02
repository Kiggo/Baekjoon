package static_ex;

public class NumberTest {
	public static void main(String[] args) {
		System.out.println("numCount의 값: "+Number.numCounter); //static사용 객체 생성없이 사용가능
	
		Number number1 = new Number();
		number1.increaseNum(); //static이 없어서 객체를 생성하여야한다.
		System.out.println("numCount의 값: "+Number.getNumCounter());
		
		System.out.println("num = "+number1.num());
		//number1.num();
		
		Number number2 = new Number();
		number2.increaseNum();
		number2.increaseNum();
		
		System.out.println("numCount의 값: "+Number.getNumCounter());
		System.out.println("numCount의 값: "+number1.getNumCounter());
		System.out.println("numCount의 값: "+number2.getNumCounter());
		             // static 멤버에 참조변수로 접근하는 것은 좋은 방법이 아니다.
		
	}
}
