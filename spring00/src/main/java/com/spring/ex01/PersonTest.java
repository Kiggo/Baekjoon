package com.spring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonTest {
	public static void main(String[] args) {
		//PersonService p = new PersonServiceImpl(); //업캐스팅
		//PersonServiceImpl p2 = (PersonServiceImpl)p; //다운캐스팅
		//p2.setName("java");
		//p2.setAge(25);
		//p.sayHello();
		/////////////////////////////////
		String path = "/src/main/java/com/spring/ex01/person.xml";
		ApplicationContext context = new FileSystemXmlApplicationContext(path);
		PersonService person = (PersonService)context.getBean("p");
		person.sayHello();
		PersonService person2 = (PersonService)context.getBean("p2");
		person2.sayHello();
	}
}
