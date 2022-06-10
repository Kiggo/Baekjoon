package diex03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DriveTest {
	public static void main(String[] args) {
	String path = "/src/main/java/diex03/carbean.xml";
	ApplicationContext context = new FileSystemXmlApplicationContext(path);
	Tire tire = (Tire)context.getBean("tire");
	Car car = (Car)context.getBean("car");
	String car2 = car.getTireBrand();
	System.out.println(car2);
	}
}
