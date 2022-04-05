package api.ex;

public class EqualsEx{
	public static void main(String[] args) {
		String strVar1 = new String("java");
		String strVar2 = "java";
		String strVar3 = "java";
		System.out.println(strVar2==strVar3);
		System.out.println(strVar1==strVar2);
		//문자열 비교
		System.out.println(strVar2.equals(strVar1));
		if(strVar1.equals(strVar2))
			System.out.println("같은 문자열");
		else
			System.out.println("다른 문자열 가짐 ");
		
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str1 = new String (bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		//byte b = 127;   Hello+\r\n-->7byte   
		
		String ssn = "123456-1234567";
		int len = ssn.length();
		System.out.println("문자열의 길이: "+len);
		char gendar = ssn.charAt(7);
		switch(gendar) {
		case '1':
		case '3':
			System.out.println("남");
			break;
		case '2':
		case '4':
			System.out.println("여");
			break;
			
		}
	}
}