package exception_ex;

public class ArrayIndexOutExceptionEx {
	public static void main(String[] args) {
		/*String data1 = args[0];
		String data2 = args[1];
		System.out.println("args[0]"+data1);
		System.out.println("args[0]"+data2);
		*/
		int[] arr = new int [3]; //arr[0], arr[1], arr[2]
		arr[0]=0;
		try {
			for(int i = 0; i<3; i++) {
				arr[i+1]=i+1+arr[i]; 
				System.out.println(arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위에 벗어났다");
		}
		System.out.println("종료");
	}
}
