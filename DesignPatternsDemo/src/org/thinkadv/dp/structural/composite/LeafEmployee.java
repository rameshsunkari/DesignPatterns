package org.thinkadv.dp.structural.composite;

public class LeafEmployee extends AbstractEmployee {
	
	

	public LeafEmployee(int id, String name, double salary, String employeeType) {
		super(id, name, salary, employeeType);
	}

	@Override
	public void print() {
		System.out.println("=========================");
		System.out.println("Id =" + getId());
		System.out.println("Name =" + getName());
		System.out.println("Salary =" + getSalary());
		System.out.println("Employee Designation =" + getEmployeeType());
		System.out.println("=========================");

	}

}
