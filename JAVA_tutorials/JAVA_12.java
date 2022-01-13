package Hello;

class Calculator {
	public int x;
	public int y;
	public void printResult() {
	System.out.printf("%d + %d = %d", x, y, x + y);
	System.out.printf("\n%d - %d = %d", x, y, x - y);
	System.out.printf("\n%d / %d = %d", x, y, x / y);
	System.out.printf("\n%d * %d = %d", x, y, x * y);
		}
	}
public class JAVA_12 {

	public static void main(String[] args) {
		
	    Calculator calculator = new Calculator();
		calculator.x = 30;
		calculator.y = 50;

		calculator.printResult();

	}

}
