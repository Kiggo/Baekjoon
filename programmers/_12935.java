package programmers;

import java.util.Arrays;

public class _12935 {
	public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int minNum = arr[0];
        for(int i=0; i<answer.length; i++){
            if(arr[i]<minNum)
                minNum=arr[i];
        }
        if(arr.length>1) {
        	answer = new int[arr.length-1];
        }
        else {
        	answer = new int[1];
        	answer[0]=-1;
        	return answer;
        }
        System.out.println(minNum); // 최소값
        
        int index = 0;
        for(int i=0; i<arr.length; i++) {
        	if(minNum==arr[i])
        		continue;
        	else {
        		answer[index++]=arr[i];
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		_12935 s = new _12935();
		int[]arr = {1,2,3,4};
		System.out.println(Arrays.toString(s.solution(arr)));
	}
		
}
//https://programmers.co.kr/learn/courses/30/lessons/12935