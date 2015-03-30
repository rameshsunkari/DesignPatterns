package org.thinkadv.dp.structural.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee emp1 = new LeafEmployee(101, "Sohan Kumar", 20000.0, "Cashier");
		Employee emp2 = new LeafEmployee(102, "Mohan Kumar", 25000.0, "Cashier");
		Employee emp3 = new LeafEmployee(103, "Seema Mahiwal", 30000.0,
				"Accountant");
		Employee manager1 = new CompositeEmployee(100, "Ashwani Rajput",
				100000.0, "Manager");

		((CompositeEmployee) manager1).add(emp1);
		((CompositeEmployee) manager1).add(emp2);
		((CompositeEmployee) manager1).add(emp3);
		manager1.print();

	}

}
