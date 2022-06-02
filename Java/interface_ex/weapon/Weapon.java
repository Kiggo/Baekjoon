/* 전략 패턴: 여러알고리즘을 하나의 추상적인 접근점(Interface)을 만들어 접근점에서
 * 서로 교환가능(Delegate)하도록 하는 패턴
 */
package interface_ex.weapon;

public interface Weapon {

	public void attack();
}
