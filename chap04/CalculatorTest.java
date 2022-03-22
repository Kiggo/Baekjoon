package chap04;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.powerOn();
		int res = calc.plus(200, 500);
		System.out.println("결과 = "+res);
		int x = 1000, y = 2000;
		res = 0;
		res = calc.plus(x, y);
		System.out.println("결과 = "+res);
		calc.powerOff();
	}
}
