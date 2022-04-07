package io_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendTest {
	public static void main(String[] args) {
		int no;
		Scanner sc = new Scanner(System.in);
		List<Friend> list = new ArrayList<Friend>();
		
		while(true) {
			System.out.println("1.친구등록 2.전체보기 3.종료");
		no = sc.nextInt();
			switch (no) {
			case 1:
				System.out.println("친구 등록 메뉴입니다.");
				System.out.print("이름: ");
				list.add(new Friend(sc.next(),sc.next(), sc.next()));
				int len = list.size(); //총 객체수
				System.out.println("친구 "+len+"명이 등록됨");
				break;
			case 2:
				System.out.println("전체 친구 목록 보기");
				for(int i = 0; i<list.size(); i++) {
				System.out.println(list.get(i));
				}
				System.out.println();
				break;
			case 3:
				System.out.println("종료");
				System.exit(0); 
			default:
				break;
			}
			
		}
	}

}
