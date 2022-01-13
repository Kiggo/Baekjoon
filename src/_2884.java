import java.util.*;
public class _2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); //시
		int m = sc.nextInt(); // 분
		
		
		if(m<45) {
			h--;             //시 1 감소
			m= 60-(45-m);    //분 감소
			if(h<0) {
				h=23;
			}
	System.out.println(h+" "+m);
		}else 
		
        System.out.println(h+" "+(m-45)); //45분일경우 0을 만듬
	    sc.close();
		}
	}
		

	

