package programmers;

public class _12934 {

    public long solution(long n) {
        long answer = (long) Math.sqrt(n);
 		if(Math.sqrt(n)>0&&Math.sqrt(n)%1==0)
 			answer=(long) ((Math.sqrt(n)+1)*(Math.sqrt(n)+1));
 		else
 			answer=-1;
         
         return answer;
     }
     public static void main(String[] args){
         _12934 s = new _12934();
         System.out.println(s.solution(3));
     }
 }