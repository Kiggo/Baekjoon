package array;

public class ArrayTest_09 {
	//배열 필드 선언
	//생성자 메소드에 배열 인자값을 받는다
	private int[] gradesArray;
	
	public ArrayTest_09(int[] gradesArray) {
		setGradesArray(gradesArray);
	}
	
	public int[] getGradesArray() {
		return gradesArray;
	}
	
	public void setGradesArray(int[] gradesArray) {
		this.gradesArray = gradesArray;
	}
	
	public void processGrade() {//전체 메소드 처리
		outputGrades();
		double avg = getAverage();
		System.out.printf("\n평균 : %.2f\n",avg);
		int highGrade = getMaxiumum();
		System.out.printf("최대점수 : %d\n",highGrade);
		int lowGrade = getMiniumum();
		System.out.printf("최소점수 : %d\n",lowGrade);
		OutputBarchart();
		
	}
	private void outputGrades() {
		System.out.println("각 학생의 점수 내용");
		for(int i = 0; i<gradesArray.length; i++) 
			System.out.printf("학생%02d:%3d\n",i+1,gradesArray[i]);
	}
	
	public double getAverage() {
		int total = 0;
		double avg = 0.0;
		for(int grade : gradesArray) //향상된for문
			total+=grade;
		avg=total/gradesArray.length;
		return avg;
	}
	
	public int getMaxiumum() {
		int highGrade = gradesArray[0];
		for(int grade : gradesArray) {
			
			if(grade>highGrade)
				highGrade=grade;
		}
		return highGrade;
	}
	
	public int getMiniumum() {
		int lowGrade = gradesArray[0];
		for(int grade : gradesArray) {
		
			if(grade<lowGrade)
				lowGrade=grade;
		}
		return lowGrade;
	}
	
	public void OutputBarchart() {
		
		System.out.println("-----점수 분포도-----");
		int[]frequency = new int[11];
		for(int grade: gradesArray)
			++frequency[grade/10]; //++i; frequency[++index];
		
		for(int count = 0; count<frequency.length; count++) {
			//"00-09 10-19.....
			if(count==10)
				System.out.printf("%5d:",100);
			else
				System.out.printf("%02d-%02d:",count*10,count*10+9);
			for(int i = 0; i<frequency[count]; i++) 
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[]gradesArray = { 87, 68 ,94 ,100 ,83 ,78 ,85 ,91 ,76, 87};
		ArrayTest_09 arTest = new ArrayTest_09(gradesArray);
		//arTest.setGradesArray(gradesArray);//setXXX 메소드로 전달
		arTest.processGrade();
	}
}
