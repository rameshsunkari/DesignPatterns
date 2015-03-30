package org.thinkadv.dp.structural.decorator;

public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator() {
		super();
	}

	public CarDecorator(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void assemble() {
		this.car.assemble();
	}

}
