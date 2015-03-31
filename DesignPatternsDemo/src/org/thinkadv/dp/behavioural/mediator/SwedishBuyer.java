package org.thinkadv.dp.behavioural.mediator;

public class SwedishBuyer extends Buyer {
	public SwedishBuyer(Mediator mediator) {
		super(mediator, "krona");
		this.mediator.registerSwedishBuyer(this);
	}
}
