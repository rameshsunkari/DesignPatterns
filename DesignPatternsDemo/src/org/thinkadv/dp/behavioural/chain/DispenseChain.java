package org.thinkadv.dp.behavioural.chain;

public interface DispenseChain {
	 
    void setNextChain(DispenseChain nextChain);
     
    void dispense(Currency cur);
}