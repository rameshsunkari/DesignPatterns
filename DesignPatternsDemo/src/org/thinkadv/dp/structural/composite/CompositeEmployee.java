package org.thinkadv.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee extends AbstractEmployee {
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	public CompositeEmployee(int id, String name, double salary, String employeeType) {
		super(id, name, salary, employeeType);
	}

	public void add(Employee employee) {
		employees.add(employee);
	}

	public Employee getChild(int i) {
		return employees.get(i);
	}

	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public void print() {
		System.out.println("==========================");
		System.out.println("Id =" + getId());
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());
		System.out.println("Employee Designation =" + getEmployeeType());
		System.out.println("==========================");

		for (Employee employee : employees)
			employee.print();

	}
}
