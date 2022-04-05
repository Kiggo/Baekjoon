package innerclass;

public class InnerTest3 {
	public static void main(String[] args) {
		MyOuter3.Inner inner = new MyOuter3.Inner("세종시 세종구");
		System.out.println("고객정보 >> "+inner.getUserInfo());
	}
}
