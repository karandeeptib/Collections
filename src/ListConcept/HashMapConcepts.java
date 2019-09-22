package ListConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {

	public static void main(String[] args) {
		//HashMap implements Map interface
		//extends AbstractMap
		//It contains only unique elements
		//It stored values in the form of Key and value pair
		//It may have one null key and multiple null values
		//It maintains No order
		// IT is non-synchronize - if used in multi threading env, more than 1 thread can access the hashmap - non thread safe
		//Concurrrent modification exception : Fail fast condition... if while accessing one value by one thread, the value is concurrently changed by another thread
		//HashTable is synchorinised
		
		
		
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Selenium");
		map.put(2, "qtp");
		map.put(3, "QC");
		
		System.out.println(map.get(1));
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() +"  "+m.getValue());
		}
		
		
		HashMap<Integer,Employee> emp= new HashMap<Integer, Employee>();
		
		Employee e1=new Employee("Tom", 25,"admin");
		Employee e2=new Employee("Peter", 26,"qa");
		Employee e3=new Employee("Steve", 27,"dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//travesing the Hashmap
		
		for (Map.Entry<Integer,Employee> m:emp.entrySet()) {
			int key=m.getKey();
			
			Employee e=m.getValue();
			System.out.println(key +" ");
			System.out.println(e.name +" "+e.age +" "+e.dept);
		}

	}

}
