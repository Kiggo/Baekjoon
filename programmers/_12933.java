class _12933 {
    public long solution(long n) {
        int i = 0;
        String num = String.valueOf(n);
        long answer;
        long[] arr = new long[num.length()];
        
          while(n>0){
            arr[i] = n%10;
            n = n/10; 
            i++;
        }
          
        for(i=0; i<num.length(); i++) {
        	 for(int j=i+1; j<num.length(); j++) {
        		 long sol =0;
        		 if(arr[i]<arr[j]) {
        			 sol=arr[i];
        			 arr[i]=arr[j];
        			 arr[j]=sol;
        		 }
        	}
        }
        
        String ansnum="";
        for(i=0; i<num.length(); i++)
        	ansnum+=arr[i];
        	
        answer=Long.parseLong(ansnum);
        
        return answer;
    }
    public static void main(String[] args) {
    	_12933 s = new _12933();
			System.out.println(s.solution(118372));
		}
}

//https://school.programmers.co.kr/learn/courses/30/lessons/12933