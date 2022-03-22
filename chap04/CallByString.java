package chap04;

public class CallByString {
	public void setAddress(String addr) {
		addr="경기도 수원시 장안구";
	}
	public static void main(String[] args) {
		String address="서울시 강ㅇ남구 논현동";
		CallByString st = new CallByString();
		
		System.out.println("메서드 호출 전");
		System.out.println("address= "+address);
		
		st.setAddress(address);
		
		System.out.println("메서드 호출 후");
		System.out.println("address= "+address);
	}
	
}

