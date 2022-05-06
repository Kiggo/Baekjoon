package class_ex.third;

import java.util.Scanner;

public class BankApplication {
	private static Account[]accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withraw();
			}else if(selectNo==5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("계좌생성");
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("계좌주: ");
		String owner = sc.nextLine();
		System.out.print("초기입금액: ");
		int balance = sc.nextInt();
		accountArray[0]=new Account(ano,owner,balance);
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("계좌목록");
		System.out.println("ㅡㅡㅡㅡㅡ");
		for(int i = 0; i<accountArray.length; i++)
		System.out.println(accountArray[i]);
		
		
		
		
		
		
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("예금");
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("결과: 예금이 성공되었습니다.");
	}
	
	//출금하기
	private static void withraw() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("출금");
		System.out.println("ㅡㅡㅡㅡㅡ");
		
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		return null;
		
	}
}
