package list_ex.emp;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate my = new MyDate(2022, 05, 12);
		String str = my.toString();
		System.out.println(str);
		/////////////////////////
		MyDate my2 = new MyDate();
		my2.setYear(2022);
		my2.setMonth(05);
		my2.setDay(12);
		System.out.println(my2);
	}
}
