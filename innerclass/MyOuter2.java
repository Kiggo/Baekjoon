package innerclass;

public class MyOuter2 {
	private String name;
	private int age;
	public MyOuter2(String name, int age) {
		setName(name); //this.name = name;
		setAge(age);   //this.age = age;
	}
	public String getName() {return name;}
	public int getAge() {return age;}
	public void setName(String name) {this.name = name;	}
	public void setAge(int age) {this.age = age;}
	public void test() {
		int num = 3;
		class Inner{
			private String address;
			public Inner(String address) {
				this.address = address;
			}
			public String getUserInfo() {
				System.out.println("inner test: "+num);
				return "이름: "+name+", 나이: "+age+", 주소: "+address;
			}
		}
		Inner inner = new Inner("세종시 세종구");
		System.out.println(inner.getUserInfo());
		
	}
}
