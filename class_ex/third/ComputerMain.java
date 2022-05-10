package class_ex.third;

public class ComputerMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int r = 10;
		double area = cal.areaCircle(r);
		System.out.println("원 면적: "+area);
		
		Computer com = new Computer();
		double area2  = com.areaCircle(r);
		System.out.println("원 면적: "+area2);
	}
}
