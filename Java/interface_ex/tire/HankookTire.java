package interface_ex.tire;

public class HankookTire implements ITire {

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다");
	}
}
