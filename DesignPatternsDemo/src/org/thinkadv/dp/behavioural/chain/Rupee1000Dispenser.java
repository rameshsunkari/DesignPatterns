package org.thinkadv.dp.behavioural.chain;

public class Rupee1000Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 1000) {
			int num = cur.getAmount() / 1000;
			int remainder = cur.getAmount() % 1000;
			System.out.println("Dispensing " + num + " 1000RS note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}