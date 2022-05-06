package method;

public class Car {
	//필드
	
	private int gas;

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		if(gas<=1000)
			this.gas = gas;
		else
			System.out.println("가스 용량은 1000입니다. 다시 주입하세요");
	}
	
	public boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없음");
			return false;
		}
		System.out.println("gas가 있음");
		return true;
	}
	
	public void run() {
		while(true) {
		if(gas>0) {
			System.out.println("차가 달림.(gas 잔량: "+gas+")");
			gas-=1;
			}else {
				System.out.println("차가 멈춤.(gas 잔량: "+gas+")");	
				return;
			}
		}
	}
}
