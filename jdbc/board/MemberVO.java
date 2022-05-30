package jdbc.board;

public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String email;
	
	public MemberVO() {
	}
	public MemberVO(String id, String password, String name, String email) {
		setId(id);//this.id = id;
		setPassword(password);//this.password = password;
		setName(name);//this.name = name;
		setEmail(email);
	}
	public MemberVO(String id) {
		setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String str="";
		str=String.format("%8s %8s %8s %8s", id,password,name,email);
		return str;
	}
}
