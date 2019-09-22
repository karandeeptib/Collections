package ListConcept;

public class Employee {
	
	String name;
	int age;
	String dept;
	
	Employee(String name, int age, String dept) {
		this.name=name;   // with this keyword, we initialize the global variable with local variable.
		this.age=age;
		this.dept=dept;
	}

}
