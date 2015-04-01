package org.thinkadv.dp.behavioural.visitor;

public class VisitorPatternDemo {

	public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(200, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
         
        int total = calculatePrice(items, new AxisShopingCart());
        System.out.println("Total Cost from Axis = "+total);
        
        total = calculatePrice(items, new IciciShopingCart());
        System.out.println("Total Cost from Icici = "+total);
    }
 
    private static int calculatePrice(ItemElement[] items,ShoppingCartVisitor visitor) {
        int sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
