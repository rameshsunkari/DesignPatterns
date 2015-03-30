package org.thinkadv.dp.behavioural.chain;

public class AtmDispenseChain {
	private DispenseChain rootChain;
	 
    public DispenseChain getRootChain() {
		return rootChain;
	}

	public void setRootChain(DispenseChain rootChain) {
		this.rootChain = rootChain;
	}

	public AtmDispenseChain() {
        // initialize the chain
        this.rootChain = new Rupee1000Dispenser();
        DispenseChain childChain1 = new Rupee500Dispenser();
        DispenseChain childChain2 = new Rupee100Dispenser();
 
        // set the chain of responsibility
        rootChain.setNextChain(childChain1);
        childChain1.setNextChain(childChain2);
    }
}
