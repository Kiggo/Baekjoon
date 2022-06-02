package class_ex.third;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()");
		return Math.PI*r*r;
	}
}
