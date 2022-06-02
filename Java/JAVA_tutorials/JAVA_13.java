package Hello;

class Student {
	String string;
	int i;
	int j;
	int k;
	
     public Student(String string, int i, int j, int k) {
		this.string = string;
		this.i = i;
		this.j = j;
		this.k = k;
		}

	public void getAverage() {
		System.out.println(string+"ÀÇ Æò±Õ Á¡¼ö: "+(float)(i+j+k)/3);
		}
}
public class JAVA_13 {

      public static void main(String[] args) {
	
		Student student1 = new Student("ÄÚ¹Â", 100, 80, 75);
		Student student2 = new Student("±èº¯¼ö", 96, 58, 90);
	
		student1.getAverage();
		student2.getAverage();

	}

}


