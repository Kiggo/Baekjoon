package list_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("java"); //java는 한 번만 저장됨
		set.add("jdbc");
		set.add("servlet");
		set.add("java");
		set.add("iBatis");
		int len = set.size(); // 저장된 객체 수 얻기
		System.out.println("총 객체수 : "+len);
		
		Iterator<String> iterator = set.iterator(); //반복자 얻기  //list 반복자 for문보다는 이렇게 사용하는게 권장됨
		while(iterator.hasNext()) {					//객체 수만큼 루핑
			String element = iterator.next();		//한 개의 객체를 가져온다.
			System.out.println("\t"+element);
		}
		
		set.remove("jdbc");							//한 개의 객체 삭제
		len = set.size();
		System.out.println("총 객체수 : "+len);		//저장된 객체 수 얻기
		iterator = set.iterator();					//반복자 얻기
		while(iterator.hasNext()) {
			String element = iterator.next();		//객체 수만큼 루핑
			System.out.println("\t"+element);
		}
		set.clear();								//모든 객체를 제거하고 비움
		if(set.isEmpty())
			System.out.println("비어있음");
		else
			System.out.println("자료가 있음: "+len);
	}
}
