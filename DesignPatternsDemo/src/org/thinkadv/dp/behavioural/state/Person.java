package org.thinkadv.dp.behavioural.state;

public class Person {
	private EmotionalState emotionalState;

	public Person(EmotionalState emotionalState) {
		this.emotionalState = emotionalState;
	}

	public void setEmotionalState(EmotionalState emotionalState) {
		this.emotionalState = emotionalState;
	}

	public EmotionalState getEmotionalState() {
		return emotionalState;
	}

	public String hello() {
		return getEmotionalState().sayHello();
	}

	public String bye() {
		return getEmotionalState().sayGoodbye();
	}
}
