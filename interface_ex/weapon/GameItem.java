package interface_ex.weapon;

public class GameItem {
	private Weapon weapon;// 접근점
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if(weapon==null)
			System.out.println("맨손 공격");
		else
			weapon.attack();
	}
}
