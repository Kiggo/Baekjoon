package io_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	String name;
	String job;
	public Person() {}
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ",job=" + job + "]";
	}
	
}
public class SerializationEx {
	public static void main(String[] args) {
		Person p1 = new Person("이순신", "군인");
		Person p2 = new Person("김길동", "SW개발");
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("c:\\temp\\serial.out");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			oos.writeObject(p2);
		} catch (FileNotFoundException e) {
			System.out.println("경로상에 파일이 없음");
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\temp\\serial.out");
			ois = new ObjectInputStream(fis);
			Person p3 = (Person)ois.readObject(); //형변환 역직렬화
			Person p4 = (Person)ois.readObject(); //형변환 역직렬화
			System.out.println(p3);
			System.out.println(p4);
		} catch (FileNotFoundException e) {
			System.out.println("경로상에 파일이 없음");
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스가 없음");
		}
		
	}
}
