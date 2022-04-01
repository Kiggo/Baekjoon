package Inheritanceof_ex;

public class InstanceOfExample {
	public static void main(String[] args) {
	    //Parent Parent = new Parent(); Parent 자신의 객체
		Parent parent = new Child();
		method1(parent);
		Parent parent2 = new Parent();
		method1(parent2);
	}
	private static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 = Child 변환 성공");
		}else {
			System.out.println("method1 = Child 변환 실패");
		}
		
	}
}
