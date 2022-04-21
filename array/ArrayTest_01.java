package array;


public class ArrayTest_01 {
	String name;
	int num;
	
	public ArrayTest_01() {
		System.out.println("생성자 메소드...");
		System.out.println("이름 : "+name);
		System.out.println("숫자 : "+num);
	}
	public ArrayTest_01(String name, int num) { //String name = "java" int num = 200;
		this.name = name;
		this.num = num;
	}
	
	public static void main(String[] args) {
		ArrayTest_01 at = new ArrayTest_01(); //객체를 초기화 --> 필드를 자동 초기화
		ArrayTest_01 at2 = new ArrayTest_01("java", 200);
		
		int[]arr = new int[5]; //자동으로 값을 초기화 시킨다
		//arr[0]=100; //int a = 100; 과 같다 
		//arr[1]=300; //int b = 300;
		arr[2]=500; //int c = 500;
		arr[3]=700; //int d = 700;
		arr[4]=900; //int f = 900;
		arr[2]=arr[0]+arr[1];
		//c=a+b;
		//arr[i]
		//배열은 for사용
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("arr[2]= "+arr[2]);
		System.out.println("arr의 주소: "+arr);
		System.out.println("arr[0]의 값: "+arr[0]);
		System.out.println("arr[1]의 값: "+arr[1]);
		System.out.println("이름 : "+at.name);
		System.out.println("숫자 : "+at.num);
		System.out.println("이름 : "+at2.name);
		System.out.println("숫자 : "+at2.num);
	}
}
