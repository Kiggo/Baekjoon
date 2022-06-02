package io_ex;

import java.io.Serializable;
import java.util.Scanner;

public class Friend2 implements Serializable { //직렬화
	String name;    //직렬화 필드단위로 분해한다 덩어리채 전송불가
	String tel;		//직렬화
  	String addr;	//직렬화
    transient static Scanner sc;
  		//transient -> 직렬화에서 제외시킨다
  	static {
  		sc = new Scanner(System.in);
  	}
	public Friend2() {
		System.out.print("name=");
		name = sc.nextLine();
		System.out.print("tel=");
		tel = sc.nextLine();
		System.out.print("addr=");
		addr = sc.nextLine();
	}
	public void register() {
		System.out.print("name=");
		name = sc.nextLine();
		System.out.print("tel=");
		tel = sc.nextLine();
		System.out.print("addr=");
		addr = sc.nextLine();
	}
	
	public void disp() {
		System.out.println(name+"\t"+tel+"\t"+addr);
	}
}
