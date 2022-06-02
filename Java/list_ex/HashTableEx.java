package list_ex;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring","123");
		map.put("summer", "123");
		map.put("fail", "1234");
		map.put("winter", "12345");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디: ");
			String id = sc.nextLine();
			System.out.print("비밀번호: ");
			String pwd = sc.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pwd)) {
					System.out.println("로그인 됨");
					break;
				}else
					System.out.println("비밀번호가 일치하지 않음");
			}else {
				System.out.println("입력한 아이디가 존재하지 않음");
			}
		}//end while
		
	}
}
