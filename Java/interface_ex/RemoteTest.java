package interface_ex;

public class RemoteTest {
	public static void main(String[] args) {
		// 1.전원 On 2.volumn 값 3.전원Off
		// RemoteControl rc = new RemoteControl();
		Television tv = new Television();
		Audio au = new Audio();
		BeamProject beam = new BeamProject();
	
		/*RemoteControl rc1 = new Television(); //업캐스팅 부모로부터 자식 객체 생성
		rc1.turnOn();
		rc1.setVolume(3);
		rc1.setMute(true);
		rc1.turnOff();
		Television tv1 = (Television)rc1; //다운캐스팅
		tv.tvSize();
		
		printInstance(rc1);*/
		RemoteControl rc1 = new Television();
		printInstance(rc1);
		rc1 = new Audio();
		printInstance(rc1);
		//rc1 = new BeamProject();
		//printInstance(beam);
	}

	private static void printInstance(RemoteControl rc) {
		/*rc.turnOn();
		rc.setVolume(3);
		rc.setMute(true);
		rc.turnOff();*/
		
		String str="";
		if(rc instanceof Television) {
			Television tv =(Television)rc; //downcasting
			str+="---------TV----------\n";
			System.out.print(str);
			rc.turnOn();
			rc.turnOff();
			System.out.println(rc);
		}else if (rc instanceof Audio) {
			Audio au=(Audio)rc; //downcasting
			str+="--------Audio--------\n";
			System.out.print(str);
			rc.turnOn();
			rc.turnOff();
			System.out.println(rc);
		}
		
	}
	

	
}
