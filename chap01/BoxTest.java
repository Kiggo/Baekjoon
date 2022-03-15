package chap01;

public class BoxTest {//클래스=속성+메소드()
	// 속성(필드=변수)
	int width;
	int height;
	int depth;

	public int calcVolume(int w,int h, int d){//함수-->메소드, 결과 값이 반드시 존재 (하나의 값)
		//명령어의 집합
		//독립적인 구조다 (단독으로 실행한다)
		//자료형을 선언한다
		width = w;
		height = h;
		depth = d;
		int vol2=width*height*depth;
		return vol2;
}	
	public static void main(String[] args) {

	
	BoxTest box = new BoxTest(); //박스 생성
	System.out.println("box= "+box);
	int w = 200; //width=w;
	int h = 200; //height=h;
	int d = 200; //depth=d;
	//속성 접근(간접 접근으로 변경)
	box.width=100;
	box.height=100;
	box.depth=100;
	
	int vol = box.width*box.height*box.depth;
	System.out.println("체적="+vol);
	System.out.println("width= "+w);
	//////////////////////////////////////
	//int vol2=10000;
	int volume = box.calcVolume(w, h, d);
	System.out.println("체적: "+volume);

	}
}


