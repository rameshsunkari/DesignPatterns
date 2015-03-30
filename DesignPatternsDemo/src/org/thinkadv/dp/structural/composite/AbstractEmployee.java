package org.thinkadv.dp.structural.composite;

public abstract class AbstractEmployee implements Employee {

	private int id;
	private String name;
	private double salary;
	private String employeeType;

	public AbstractEmployee() {

	}

	public AbstractEmployee(int id, String name, double salary, String employeeType) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.employeeType = employeeType;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String getEmployeeType() {
		return employeeType;
	}
}
