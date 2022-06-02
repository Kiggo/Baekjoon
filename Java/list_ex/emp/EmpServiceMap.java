package list_ex.emp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EmpServiceMap {
	private HashMap<Integer, Employee> map;
	private static EmpServiceMap service = new EmpServiceMap();
	
	private EmpServiceMap() {
		map = new HashMap<Integer, Employee>();
	}
	public static EmpServiceMap getInstance() {
		return service;
	}
	public void addEmployee(Employee e) {
		/*boolean flag = false;
		Set<Integer> set = map.keySet();
		for(int key : set) {
			if(map.get(key).getName().equals(e.getName())) {
				flag = true;
				System.out.println(e.getName()+" 님은 이미 존재합니다");
				return;
			}
		}
		if(flag==false)
			map.put(e.getSsn(), e);
			System.out.println(e.getName()+" 님은 회원 가입 되셨습니다.");
			*/
		if(map.containsKey(e.getSsn())) {
			System.out.println(e.getName()+" 님은 이미 존재합니다");
			return;
		}else {
			map.put(e.getSsn(), e);
			System.out.println(e.getName()+"님이 회원으로 가입되었습니다.");
			}
			
	}
	
	public void getEmployee() {
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(map.get(key));
		}
	}
	
	
}
