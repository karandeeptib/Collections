package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//Similar to HashMap BUT HashTable is synchronized
		//Stores the value on the basis of Key and Value pair
		//Key is stored as Object and each ebject has unique Hashcode(32bit int)
		// KEy, value will be stored as <<342321>, value>.
		//HasdTable is thread safe. One by on tread can access Hashtable object.
		//null key and null value is not allowed, Nullpointerexception
		
		
		
		Hashtable h1=new Hashtable();
		
		h1.put(1, "Tom");
		h1.put(2, "Java");
		h1.put(3,"Selenium");
		
		//create a clone cope/shallow copy
		
		Hashtable h2=new Hashtable();
		h2=(Hashtable)h1.clone();
		
		System.out.println("The value from h1 :" +h1);
		System.out.println("The value from h2 :" +h2);
		
		//contains value
		
		Hashtable h3=new Hashtable();
		h3.put("A", "Tom");
		h3.put("B", "QA");
		h3.put("C", "Selenium");
		
		if(h3.containsValue("Tom")) {
			System.out.println("Value is found");
		}
		
		
		//Printing all the value from Hashtable using -> Enumeration elements.
		Enumeration e=h3.elements();
		System.out.println("Prints value using enumeration");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get all the values from Hashtable using entryset
		System.out.println("Prints value using Entry set");
		Set s=h3.entrySet();
		System.out.println(s);
		
		
		// get the value from key
		
		System.out.println("Value of A is " +h3.get("A"));
		
		//get the hashcode of hashtable object
		
		System.out.println("Hashcode value of h3 is " +h3.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
