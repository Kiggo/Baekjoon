package Inheritance;

public class People {
	protected String name;
	protected String ssn;
	
	public People() {}
	public People(String name, String ssn) {
		setName(name); // this.name = name;
		setSsn(ssn); // this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
