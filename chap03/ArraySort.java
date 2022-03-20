package chap03;

public class ArraySort {

	public static void main(String[] args) {
		int [] num = {5, 4, 3, 2, 1};
		int temp = 0;
		System.out.println("정렬 전 배열");
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		for(int i = 0; i<num.length; i++) {
			for(int j = i+1; j<num.length; j++) {
				if(num[i]>num[j]) {  // num[0]>num[1]
					  //  부등호 방향에 따라 오름차순 내림차순 결정됨
					temp = num[i];   // temp = num[0]
					num[i] = num[j]; // num[0] = num[1]
					num[j] = temp;   // num[1] = num[0] = temp
				}
			}
		}
		System.out.println();
		System.out.println("정렬 후 배열");
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
	}

}
