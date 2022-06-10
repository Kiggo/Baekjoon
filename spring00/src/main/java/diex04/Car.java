package diex04;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	Tire tire; //클래스지만 속성으로 사용하겠다
	
	public String getTireBrand() {
		
		return "장착된 타이어:"+ tire.getBrand();
	}

	
}
