
import java.util.Arrays;

public class _12933 {
	public int[] solution(long n) {
    int count = 0;
    long num = n;
    while(n>0){
        count++;
        n=n/10;
    }
       
   int[] answer = new int [count];
    
    for(int i = 0; i<count; i++){
       answer[i]=(int)(num%10);
        num=num/10;
    }
    return answer;
	}

	public static void main(String[] args) {
		_12933 s = new _12933();
		System.out.println(Arrays.toString(s.solution(12345)));
	}
}
