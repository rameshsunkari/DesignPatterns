package org.thinkadv.dp.behavioural.chain;

import java.util.Scanner;

public class ChainDPDemo {

	public static void main(String[] args) {
		AtmDispenseChain atmDispenser = new AtmDispenseChain();
		Scanner input = null;
		int amount = 100;
        while (amount >= 100) {
        	System.out.println("Enter amount to dispense");
            input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                System.exit(0);;
            }
            // process the request
            atmDispenser.getRootChain().dispense(new Currency(amount));
        }
        
        if (input != null)
        	input.close();
	}

}
