package Hello;
import java.util.Scanner;

public class JAVA_11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
        
	System.out.print("���� 5���� ����� �����Ͽ� �Է��ϼ���: "); 
      
	int length = 5; 
      
	int[] value = new int[length];
   
    for (int i = 0; i < length; i++) {
    	value[i] = sc.nextInt();
}
    System.out.println("======= �Է� �Ϸ� =======");
    System.out.println("======= ��� ���� ======="); 
   
    for (int i = length-1; i >= 0; i-- ) {
    	System.out.println(value[i]);
    	}
     
    
    sc.close();

		

	}

}