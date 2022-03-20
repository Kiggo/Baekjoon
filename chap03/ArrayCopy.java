package chap03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		char[] arr1 = { 'h', 'e', 'l', 'l','o'};
		
		// 방법1
		char[] arr2 = new char[arr1.length];
		//  arraycopy(원본배열, 원본시작인덱스, 타겟배열, 타겟시작인덱스, 복사개수)
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); //arr1전체를 arr4에복사
		// system.arraycopy(arr1, 1, arr4, 0, arr1.length-1);
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		// 방법2
		char[] arr3 = Arrays.copyOf(arr1, arr1.length); // arr1을 전체를 arr2로 복사
		for(int i = 0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		
		// 방법3
		char[] arr4 = Arrays.copyOfRange(arr1, 0, 5); //  arr[1]~arr1[3]을
	                                                 //  arr3[0]~arr3[2]로 복사
		for(int i = 0; i<arr4.length; i++) {
			System.out.print(arr4[i]+" ");
		}
	} 
	
	

}
