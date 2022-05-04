package class_ex;

public class People {
	AddClass addClass; //People의 생성자 메소드가 호출될때 같이 생성된다
	
	public People() {
		addClass=new AddClass();
	}
	
	//명령어 작성은 메소드에 만듬 
	public int cal() {
		int res = Calculator.add(100, 200);
		//System.out.println(res);
		return res;
	}
	
	public int cal(int x, int y) {
		int res = Calculator.add(x, y);
		return res;
	}
	
	public int minus() {
		int res2 = Calculator.minus(100, 200);
		return res2;
	}
	
	public void add(int num1, int num2) {//값을 외부에서 전달한다
		int res = addClass.cal(num1, num2);
		System.out.println(res);
	}
}
