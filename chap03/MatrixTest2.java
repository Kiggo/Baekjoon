package chap03;

public class MatrixTest2 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] arr = {{2,3,8},
					   {8,9,1},
					   {7,0,5}};
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(i==j) // 우  하향 대각선에 위치한 경우
					sum+=arr[i][j];
			}
		}
		System.out.println("첫 번째 대각선의 합은 "+sum);
		sum = 0;
		System.out.println();
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(i+j==2) // 우 상향 대각선에 위치한 경우
					sum+=arr[i][j];
			}
		}
		System.out.println("두 번째 대각선의 합은 "+sum);
		
}
}
