package class_ex.third;

import java.util.Scanner;

import javax.management.InvalidApplicationException;

import exception_ex.BalanceInsufficientException;

public class BankApplication {
	private static Account[]accountArray = new Account[100]; //클래스를 통해 배열을 생성
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
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
		//Account dto = new Account();
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("계좌생성");
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		//dto.setAno(scanner.next());
		System.out.print("계좌주: ");
		String owner = scanner.next();
		//dto.setOwner(scanner.next());
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		//dto.setBlance(scanner.nextInt();
		
		Account vo = new Account(ano, owner, balance); //객체는 항상 생성
		for(int i = 0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i] = vo; //acountArray[i] = dto; 중요 포인트
				System.out.println("계좌 생성 됨");
				break;
			}
		}
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("계좌목록");
		System.out.println("ㅡㅡㅡㅡㅡ");
			for(int i = 0; i<accountArray.length; i++) {	
				Account vo = accountArray[i]; //배열에 저장 되어 있는 객체를 가져옴
				if(accountArray[i]!=null) {
					System.out.print(vo.getAno()+"\t"+vo.getOwner()+"\t"+vo.getBalance());
					System.out.println();
				}
			}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("예금");
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("예금액: ");
		int money=0;
		try {
			money = amountInput();
		} catch (BalanceInsufficientException e) {
			String message=e.getMessage();
			System.out.println(message);
			//e.printStackTrace();
		}
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("검색한 계좌가 없음");
			return;
		}
		//계좌가 있으면 찾은 객체의 잔액에 예금액을 더함
		account.setBalance(account.getBalance()+money);
		System.out.println("예금 성공 함");
	}
	
	private static int amountInput() throws BalanceInsufficientException{
		
		int amt = scanner.nextInt(); //-1000
		
			if(amt<0) { 
				//throw new BalanceInsufficientException("입금액은 0보다 커야 함");
				BalanceInsufficientException bie = new BalanceInsufficientException("입금액은 0보다 커야 함");
				System.out.println(bie.getMessage());
				System.out.print("예금액 입력:");
				amountInput();
				return 0;
			}else
			return amt;
	}

	//출금하기
	private static void withraw() {
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.println("출금");
		System.out.println("ㅡㅡㅡㅡㅡ");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("출금액: ");
		int money = scanner.nextInt();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("검색한 계좌가 없음");
			return;
		}
		if(account.getBalance()-money<0)
			System.out.println("출금 실패 잔액 부족");
		else {
		account.setBalance(account.getBalance()-money);
		System.out.println("출금 성공 함");
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i<accountArray.length; i++) {	
			if(accountArray[i]!=null) {
				//배열에 저장된 계좌번호와 입력한 계좌번호가 같을때 
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break; //반복 if문 뒤에 break
				}
			}
		}
		return account;
	}
}
