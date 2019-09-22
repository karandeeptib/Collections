package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Game of Thrones");
		arr.add("Breaking Bad");
		arr.add("The big bang theory");
		arr.add("The walking dead");
		arr.add("Prison break");
		
		
		
		//1. Using for each loop and lambda expression (java 8)
		
		System.out.println("for each loop and lambda expression");
		
		arr.forEach(shows -> {
			System.out.println(shows);
		});
		System.out.println("*******************");
		
		//2. Using Iterator
		
		System.out.println("Using Iterator");
		
		Iterator it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*******************");
		
		//3.using Iterator and forEachRemaining() method (java 8)
		
		System.out.println("Iterator and forEachRemaining() method");
		
		Iterator itr=arr.iterator();
		itr.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		System.out.println("*******************");
		
		//4. using for each loop
		System.out.println("for each loop");
		
		for(String show: arr) {
			System.out.println(show);
		}
		
		System.out.println("*******************");
		
		//5. using for loop with index
		System.out.println("for loop with index");
		
		for (int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("*******************");
		
		//6. using listIterator() to travese in both the direction
		System.out.println("listIterator() to travese in both the direction");
		ListIterator<String> showIterator=arr.listIterator(arr.size());
		while(showIterator.hasPrevious()) {
			System.out.println(showIterator.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
