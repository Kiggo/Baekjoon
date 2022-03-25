package Inheritance;

public class DmbCellPhoneTest {
	public static void main(String[] args) {
		/*
		 * DmbCellPhone dmb = new DmbCellPhone(); //객체 초기화 dmb.setModel("자바폰");
		 * dmb.color = "검정"; dmb.channel = 300;
		 * 
		 * System.out.println("model: "+dmb.getModel());
		 * System.out.println("color: "+dmb.color);
		 * System.out.println("channer: "+dmb.channel);
		 */
		
		DmbCellPhone dmb2 = new DmbCellPhone("DB폰","파랑",500);
		
		System.out.println("model: "+dmb2.getModel());
		System.out.println("color: "+dmb2.color);
		System.out.println("channer: "+dmb2.channel);
		dmb2.turnOnDmb();
		dmb2.changeChannerDmb(300);
	}
}
