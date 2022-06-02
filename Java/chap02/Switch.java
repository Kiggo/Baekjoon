package chap02;

public class Switch {

	public static void main(String[] args) {
		int score = 100;
		int category = 0;
		char credit;
		
		if(score>=0 && score<=100) {
			category = score/10;
			System.out.println("category= "+category);
			
			switch(category) {
			case 10:
			case 9:
				credit='A';
				break;
			case 8:
				credit='B';
				break;
			case 7:
				credit='C';
				break;
			case 6:
				credit='D';
				break;
			default:
				credit='F';
			}
			System.out.println("시험 점수= " +score+", 학점= "+credit);
		}

	}

}
