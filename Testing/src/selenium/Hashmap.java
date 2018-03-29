package selenium;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static  void main(String[] args) {
		HashMap <Integer,String> hm = new HashMap <Integer,String>();
		hm.put(001, "vasu");
		hm.put(002, "nag");
		hm.put(003, "raj");
		System.out.println(hm.get(001));
		System.out.println(hm.get(003));
		/*for(Entry  m : hm.entrySet()) {
			System.out.println(m.getKey()+")"+ m.getValue());
		}*/
		System.out.println(hm);
		hm.remove(003);
		System.out.println(hm);
		
		
		
		HashMap <Integer,Employee> emp = new HashMap <Integer,Employee>();
		//Employee e1 = new Employee ("joy"  ,25, "software");
		Employee e1 = new Employee ("joy"  ,25, "software");
		Employee e2 = new Employee ("vasu"  ,25, "hr");
		Employee e3 = new Employee ("nag"  ,25, "engineer");
		emp.put(1, e1);
		emp.put(2,e2);
		emp.put(3,e3);
		for(Entry <Integer,Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
		
			System.out.println("Employee"+   key   + "info->");
			System.out.println("");
			
		System.out.println(e.name +  e.age+  e.dept);
		//System.out.println(e);
		
	}
	}
}
