package programmers;


public class _12947 {
	public static void main(String[] args) {
		int x = 223;
		int sum = 0;
		String strNum = Integer.toString(x);
		int[]arrNum = new int [strNum.length()]; 
		for(int i = 0; i<strNum.length(); i++) {
				arrNum[i]=strNum.charAt(i)-'0';
				sum += arrNum[i];
		}
		if(x%sum==0)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
