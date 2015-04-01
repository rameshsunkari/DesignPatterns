package org.thinkadv.dp.behavioural.template;

public class TemplateDemo {

	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
        
        //using template method
        houseType.buildHouse();
        System.out.println("************");
         
        houseType = new BrickHouse();
         
        houseType.buildHouse();

	}

}
