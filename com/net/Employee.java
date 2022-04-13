package com.net;

import java.io.Serializable;
public class Employee  implements Serializable{

	String name;
	String addr;
    String jumin;

	public Employee(String name , String addr , String jumin ) {

		setName(name);
		setAddr(addr);;
		setJumin(jumin);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
}