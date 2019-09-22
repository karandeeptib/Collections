package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("Test");
		li.add("qtp");
		li.add("Selenium");
		li.add("RPA");
		li.add("RFT");
		
		//print
		System.out.println("Contents of linkedlist:  " +li);
		
		li.addFirst("Karan");
		li.addLast("Automation");
		
		System.out.println("Contents of linkedlist:  " +li);
		
		
		//get the value
		
		System.out.println(li.get(0));
		System.out.println(li.getFirst());
		
		
		// set the value
		
		li.set(0, "new value");
		
		System.out.println(li.get(0));
		
		//remove
		
		li.removeFirst();
		li.removeLast();
		
		System.out.println(li);
		
		//remove at specific position
		li.remove(2);
		System.out.println("after removing 2nd element" +li);
		
		
		// how to iterate/print all the values of LL
		//1. using for loop
		//2 using advance for loop
		//3 iterator
		//4 while
		
		System.out.println("Printing using for loop");
		
		for (int n=0;n<li.size();n++) {
			System.out.println(li.get(n));
		}
		
		System.out.println("using advanced for loop");
		for(String str:li) {
			System.out.println(str);
		}
		
		
		System.out.println("Using iterator");
		
		Iterator<String> it=li.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("using while loop");
		
		int num=0;
		while(li.size()>num) {
			System.out.println(li.get(num));
			num++;
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
