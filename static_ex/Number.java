package static_ex;

public class Number {
	private int num;
	static int numCounter = 10;
	public static int getNumCounter() {
		int num1 = 0;
		num1 = numCounter;
		//return num; //오류 발생
		return numCounter;
	}
	
	public Number() {
		num = numCounter;
	}
	
	public void increaseNum() {
		numCounter++;
	}
	
	public int num() {
	//System.out.println(num++);
		return num++;
	}
}
