package stream_ex;

public class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		setName(name);
		setSex(sex);
		setAge(age);
	}
	
	public int getSex() {return sex;}
	public int getAge() {return age;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
