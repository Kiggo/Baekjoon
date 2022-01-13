package Hello;
import java.util.Scanner;

public class JAVA_11 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
        
	System.out.print("숫자 5개를 띄어쓰기로 구분하여 입력하세요: "); 
      
	int length = 5; 
      
	int[] value = new int[length];
   
    for (int i = 0; i < length; i++) {
    	value[i] = sc.nextInt();
}
    System.out.println("======= 입력 완료 =======");
    System.out.println("======= 출력 시작 ======="); 
   
    for (int i = length-1; i >= 0; i-- ) {
    	System.out.println(value[i]);
    	}
     
    
    sc.close();

		

	}

}