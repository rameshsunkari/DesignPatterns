package org.thinkadv.dp.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		 System.out.print("========= Mobile Shop ============ \n");  
         System.out.print("            1. IPHONE.              \n");  
         System.out.print("            2. NEXUS.              \n");  
         System.out.print("            3. LUMIA.            \n");  
         System.out.print("            4. Exit.                     \n");  
         int choice = 1;
         while (choice > 0 && choice <=3) {
        	 System.out.print("Enter your choice: ");
	         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	         choice = Integer.parseInt(br.readLine());  
	         ShopKeeperFacade sk=new ShopKeeperFacade();  
	         sk.mobileSale(choice);
         }

	}

}
