/* 무기는 공격이라는 기능을 가진 하나의 접근점이다*/
package interface_ex.weapon;

public class WeaponTest {
	public static void main(String[] args) {
		GameItem item = new GameItem();
		item.attack();
		item.setWeapon(new Knife());
		item.attack();
		item.setWeapon(new Sword());
		item.attack();
	}
}
