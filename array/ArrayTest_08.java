package array;

public class ArrayTest_08 {
	public static void main(String[] args) {
		int[]arr= {1,4,4,3,1,4,4,2,1,3,2};
		int[]counter = new int [4];
		for(int i = 0; i<arr.length; i++) {
			counter[arr[i]-1]++; 
		}
		for(int i = 0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for(int j = 0; j<counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
