package com.tns.ifet.dayfive.multilevelinheritance;
import com.tns.ifet.dayfive.Employee;
import com.tns.ifet.dayfive.Person;
public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		Person p;
		p = new Person("Dhruv", "Mumbai");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
	}
}
