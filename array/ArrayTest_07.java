package array;

import java.util.Scanner;

public class ArrayTest_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]unit = {50000, 10000, 5000, 1000, 500, 100, 10, 1};
		int res = 0, money;
		System.out.print("금액을 입력하시오>>");
		money = sc.nextInt();
		String str1, str2;
		for(int i = 0; i<unit.length; i++) {
			res = money/unit[i]; //res = 나머지
			if(res>0) {
				if(i<=3) {
					str1="원권";
					str2="매";
				}
				else{
					str1="원짜리 동전";
					str2="개";
				}
				System.out.println(unit[i]+str1+res+str2);
				money = money%unit[i];
			}//end if
		}
	}
}
