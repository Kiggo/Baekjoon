package com.spring.ex01;

public class PersonServiceImpl implements PersonService{
	
	private String name;
	private int age;
	
	public void setName(String name) { //setter를 이용해 컨테이너에서 생성된 객체를 주입
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	@Override
	public void sayHello() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		
	}
}
