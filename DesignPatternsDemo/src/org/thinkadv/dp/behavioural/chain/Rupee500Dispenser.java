package org.thinkadv.dp.behavioural.chain;

public class Rupee500Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 500) {
			int num = cur.getAmount() / 500;
			int remainder = cur.getAmount() % 500;
			System.out.println("Dispensing " + num + " 500RS note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}