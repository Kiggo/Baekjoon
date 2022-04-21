package array;


public class ArrayTest_05 {
	public static void main(String[] args) {
		int[]arr = new int [10];
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=i+1;
			sum+=arr[i];
		}
		for(int i =0; i<arr.length; i++) {
			System.out.printf("arr[%1d]=%2d\n",i,arr[i]);
		}
			System.out.printf("합은 %3d",sum);
	}
}
