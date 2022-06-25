package programmers;

public class _12931 {
	public int solution(int n) {
		int answer = 0;
		int sum = 0;
		while(n>0) {
			answer = n; 
			n = n%10;
			sum += n;
			n = answer/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		_12931 s = new _12931();
		System.out.println(s.solution(987));
	}
}
