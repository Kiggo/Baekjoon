package io_ex;

public class Friend{
	public String name;
	public String tel;
	public String addr;
	

	public Friend(String name, String tel, String addr) {
		super();
		setName(name);
		setTel(tel);
		setAddr(addr);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void disp() {
	// 출력 메소
		
	}
	@Override
	public String toString() {
		return "이름: "+name +" 전화번호: "+ tel +" 주소: "+ addr;
		
	}
	
}
