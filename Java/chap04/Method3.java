package chap04;

public class Method3 {
	public static float calcVolume(int w, int l, int h) {
		float vol = 0.f;
		vol = w*l*h;
		return vol;
	}
	
	public static void main(String[] args) {
		float vol = calcVolume(10, 15, 20);
		System.out.println("vo1="+vol);
		System.out.println("vo2="+calcVolume(10,15,20));
		int width = 5, height = 7, length = 9;
		float vol3 = calcVolume(width, length, height);
		System.out.println("vol3="+vol3);
		// static으로 선언된 메소드는 클래스명.메소드() 
		Method3.calcVolume(width, length, length);
		Method3 m = new Method3();
		m.calcVolume(width, length, length);
	}
		
	
}
