package list_ex;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25)); //저장될 때 나이 순으로 정렬됨
		treeSet.add(new Person("박지원", 31));
		
		Iterator<Person> iterator = treeSet.iterator(); //왼쪽 마지막 노드에서 오른쪽 마지막 노드까지 반복해서 가져오기 (오름차순)
		while(iterator.hasNext()){
			Person person = iterator.next();
			System.out.println(person.name+":"+person.age);
		}
	}
}
