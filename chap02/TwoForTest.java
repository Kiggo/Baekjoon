package chap02;

public class TwoForTest {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++)
				System.out.print(" i = "+i+" , j = "+j);
				System.out.println();
		}
		///////////////////////////////////////////////
		System.out.println();
		for(int i = 0; i < 5; i++) {
			System.out.println(" i = "+ i);
			for(int j = 0; j < 5; j++) {
				if(j==2)break;
				System.out.println(" j = "+j);
			}System.out.println();
		}
	}

}
