package chap03;

public class MultiArrayTest3 {

	public static void main(String[] args) {
		int[][] num;
		num= new int[4][4];
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
/*				if(i==0) {
					num[i][j]=2;
			}else if(i==1) {
					if(j!=3)
						num[i][j]=2;
				else
					num[i][j]=1;
			}else if(i==2) {
				if(j==0||j==1)
					num[i][j]=2;
			else
				num[i][j]=1;
			}else if(i==3) {
			if(i==0)
				num[i][j]=2;
				else
					num[i][j]=1;
				*/
				
				if(i+j<4) {
					num[i][j]=2;
				}else {
					num[i][j]=1;
			} // end for
			} // end for
		}	
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}
}