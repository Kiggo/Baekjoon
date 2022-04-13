package thread_ex.synch2;

public class RestaurantTest {
	public static void main(String[] args) {
		Food food = new Food();
		
		Waitor waitor = new Waitor("웨이터",food);
		waitor.start();
		
		Chef chef = new Chef("주방장",food);
		chef.start();
	}
}
