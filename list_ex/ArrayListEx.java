package list_ex;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		// int[] arr = new int [10];
		//arr[0]=100;
		//System.out.println(arr[0]);
		//for(int i = 0; i<arr.length; i++)
		// System.out.println(arr[i]);
	List<String> list = new ArrayList<>();
	list.add("java");
	list.add("12345");
	list.add("JDBC");
	list.add("spring");
	
	int len = list.size();
	System.out.println("총 객체수: "+len);
	//조회
	String str = list.get(2);
	System.out.println("str: "+str);
	for(int i = 0; i<len; i++) {
		String str2 = list.get(i);
		System.out.println(i+":"+str2);
	}
	String del = list.remove(2);
	System.out.println(del+"이 삭제 됨");
	for(int i = 0; i<list.size(); i++) {
		String str3 = list.get(i);
		System.out.println(i+":"+str3);
	}
	list.add(2,"jsp");
	list.add("servlet");	
	for(int i = 0; i<list.size(); i++) {
		String str3 = list.get(i);
		System.out.println(i+":"+str3);
	}
	list.set(1, "jquery");
	
	Iterator<String> iterator = list.iterator();  //list 반복자 for문보다는 이렇게 사용하는게 권장됨
	while(iterator.hasNext()) {
		String element = iterator.next();
		System.out.println("\t"+element);
	}
	for(int i = 0; i<list.size(); i++) {
		String str3 = list.get(i);
		System.out.println(i+":"+str3);
	}
	list.clear();
	for(int i = 0; i<list.size(); i++) {
		String str3 = list.get(i);
		System.out.println(i+":"+str3);
	}
	
}
}
