package chap04;

public class CallByRef {
	public void increase(int[] n) { //[]안에 주소가 들어간다 n=ref1
		for(int i = 0; i<n.length; i++) {
			n[i]++;
		}
	}
	
	public static void main(String[] args) {
		int [ ] ref1 = {100,800,1000};
		CallByRef ref = new CallByRef();
		System.out.println("메서드 호출 전");
		for(int i = 0; i<ref1.length; i++) {
			System.out.println("ref1["+i+"] :"+ref1[i]);
		}
		
		ref.increase(ref1);  // 이곳의 주소가 위쪽으로이동 배열명 = 주소
		System.out.println();
		
		System.out.println("메서드 호출 후");
		for(int i = 0; i<ref1.length; i++) {
			System.out.println("ref1["+i+"] :"+ref1[i]);
		}
	}
}
