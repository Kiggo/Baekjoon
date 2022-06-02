package api.ex;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		
	int [] scores = {90, 80, 70};
	Arrays.sort(scores);							//검색기능 Arrays.sort() 메소드로 항목들을 오름차순으로 정렬한후
	int index = Arrays.binarySearch(scores, 90);    //Arrays.binarySearch() 메소드로 항목 검색
	System.out.println("찾은 인덱스: "+index);      
	
	for(int i = 0; i<scores.length; i++)
		System.out.println("scores["+i+"]="+scores[i]);
	System.out.println();
	
	String[] names = {"이순신", "홍길동", "자바"};
	Arrays.sort(names);
	index = Arrays.binarySearch(names, "자바"); 
	System.out.println("찾은 인덱스: "+index);
	for(int i = 0; i<names.length; i++)
		System.out.println("names["+i+"]="+names[i]);
	System.out.println();
	
	Member m1 = new Member("홍길동"); //클래스를 이용하려면 인터페이스의 상속을 반드시 받아야한다.
	Member m2 = new Member("박동수");
	Member m3 = new Member("김민수");
	Member [] members = {m1, m2, m3};
	Arrays.sort(members);
	for(int i = 0; i<members.length; i++)
		System.out.println("members["+i+"].name="+members[i].name);
	}
}
