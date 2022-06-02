package innerclass;

public class MyOuter3 {
	private String name;
	private int age;
	public MyOuter3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {return name;}
	public int getAge() {return age;}
	
	static class Inner{
		private String address;
		static String tel = "010-1111-2222";
		
		public Inner(String address) {
			this.address = address;
		}
		public String getUserInfo() {
			//return name + " " +age; static 내부 클래스에서 
			//외부 클래스의 인스턴스 변수 접근시 오류가 발생한다.
			return "주소는: "+address+" , 전화번호: "+tel;
		}
		
	}
}
