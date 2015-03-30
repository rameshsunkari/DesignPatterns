package org.thinkadv.dp.structural.facade;

public class ShopKeeperFacade {
	private Mobile iphone;  
    private Mobile nexus;  
    private Mobile lumia;
    
    public ShopKeeperFacade() {
    	iphone = new Iphone();
    	lumia = new Lumia();
    	nexus = new Nexus();
    	
	}

	public Mobile getIphone() {
		return iphone;
	}

	public void setIphone(Mobile iphone) {
		this.iphone = iphone;
	}

	public Mobile getNexus() {
		return nexus;
	}

	public void setNexus(Mobile nexus) {
		this.nexus = nexus;
	}

	public Mobile getLumia() {
		return lumia;
	}

	public void setLumia(Mobile lumia) {
		this.lumia = lumia;
	}
    
    public void mobileSale(int choice) {
    	Mobile mobile = null;
    	switch (choice) {  
    	case 1:
    		mobile = iphone;
    		break;
    	case 2:
    		mobile = nexus;
    		break;
    	case 3:
    		mobile = lumia;
    		break;
    	default:
    		System.out.println("Selected Mobile is not available");
    		break;
    	
    	}
    	if (mobile == null)
    		return;
    	mobile.modelNo();
    	mobile.price();
    }
}
