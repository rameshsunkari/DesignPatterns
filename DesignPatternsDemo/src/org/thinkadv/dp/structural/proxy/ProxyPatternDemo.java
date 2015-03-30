package org.thinkadv.dp.structural.proxy;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		OfficeInternetAccess ashwani = new ProxyInternetAccess("Ashwani Rajput", 8);  
		ashwani.grantInternetAccess();
        
        OfficeInternetAccess tendesk = new ProxyInternetAccess("Ten Deskart", 4);  
        tendesk.grantInternetAccess();

	}

}
