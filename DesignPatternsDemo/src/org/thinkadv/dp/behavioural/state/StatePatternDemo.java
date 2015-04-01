package org.thinkadv.dp.behavioural.state;

public class StatePatternDemo {

	public static void main(String[] args) {
		Person person = new Person(new HappyState());
		System.out.println("Hello in happy state: " + person.hello());
		System.out.println("Goodbye in happy state: " + person.bye());

		person.setEmotionalState(new SadState());
		System.out.println("Hello in sad state: " + person.hello());
		System.out.println("Goodbye in sad state: " + person.bye());

	}

}
