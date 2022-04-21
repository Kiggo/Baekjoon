package array;

public class ArrayTest_03 {
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5};
		float ave = 0.f;
		int sum=0;
		
		for(int i = 0; i<arr.length; i++) 
			sum=sum+arr[i];
			
			ave = sum/(float)arr.length;
			System.out.println("합계: "+sum);
			System.out.println("평균: "+ave);
			System.out.printf("평균: %.2f",ave);
	}
}
