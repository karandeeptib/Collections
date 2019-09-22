package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		// Array list in a dynamic array. It overcomes the problem of static array
		//int a[]=new a[3];  -- The size is fixed, you cannot store more than 3 elements.
		
		//Properties: 
		//1. It can contains duplicate values as well
		//2. It maintains insertion order
		//3. It is not synchronized
		//4. IT allows random access to fetch any element because it stored the value on the basis of indexes.
		
		ArrayList ar=new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size()); // Size of array list
		
		ar.add(40);
		ar.add(50);
		ar.add("Hello");
		
		System.out.println(ar.size());
		
		
		// Fetching the value
		
		System.out.println(ar.get(4)); // To get the value from an index
		
		
		// to print all the values of array list , we use for loop
		//1. for loop
		//2. Iterator 
		
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//non-generic  and generic:
		//Generics define a particular type of data that can be stored in the array list
		//non-generic: you can add anytype of data 
		
		//Generics:
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ar1.add(10);
		//ar1.add("java String"); --- this gives compile time error as it is not integer
		
		ArrayList<String> ar2=new ArrayList<String>();
		
		ar2.add("Java String");
		
		
		//Employee class object  <<<< User defined class object >>>>
		
		Employee e1=new Employee("Jack", 30, "QA");
		Employee e2=new Employee("Tom", 28, "Dev");
		Employee e3=new Employee("Peter", 31, "BA");
		
		//create arraylist
		
		ArrayList<Employee> ar4= new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values
		//we use While loop here
		
		Iterator<Employee> it= ar4.iterator();
		while(it.hasNext()) {
			Employee emp= it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("**********************");
		//*************************
		
		//addAll()
		
		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("qtp");
		
		ArrayList<String> ar6= new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javascript");
		
		
		//for adding second list into first list
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		
		//removeAll()
		System.out.println("after remove all");
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		
	}

}
