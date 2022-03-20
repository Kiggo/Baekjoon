package chap03;

public class MultiArrayTest4 {

	public static void main(String[] args) {
		int[][]	num;
		num = new int[4][4];
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				if(i+j==3) {
					// num[i][j]=i*5;
					num[i][j]=(4-i)*5;
				}else {
					num[i][j]=2;
				}
			}
		}
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.print(num[i][j]+"\t");
			}
		System.out.println();
		}

	}

}
