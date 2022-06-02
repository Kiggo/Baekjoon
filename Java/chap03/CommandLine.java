package chap03;

public class CommandLine {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("사용법 : ");
			System.out.println("java Sample num1 num2");
			return;
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum = num1 + num2;
		System.out.println(num1+" + "+num2+" = "+sum);
		

	}

}
