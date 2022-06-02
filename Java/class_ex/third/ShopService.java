package class_ex.third;

public class ShopService {
	//작성위치
	public static ShopService shopService = new ShopService();
	
	public ShopService() {}
	
	static ShopService getInstance() {
		return shopService;
	}
}
