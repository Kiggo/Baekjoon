package chap02;

public class TempTest1 {

	public static void main(String[] args) {
		int BASE = 32;
		int fahrenheit=0;
		float celsius=0f;
		
		while(fahrenheit<=100) {
			celsius=(fahrenheit-BASE)*5.0f/9.0f;
			System.out.println("화씨: "+fahrenheit+"도, \t섭씨: "+celsius+"도");
			
			fahrenheit+=10;
		}

	}

}
