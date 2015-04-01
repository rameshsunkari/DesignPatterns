package org.thinkadv.dp.behavioural.visitor;

public class IciciShopingCart implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = 0;
		int bookPrice = book.getPrice();
		// apply 5% discount if book price is greater than 100
		if (bookPrice > 100) {
			cost = book.getPrice() - ((bookPrice*5)/100);
		} else {
			cost = book.getPrice();
		}
		System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost ="
				+ cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit.getName() + " cost = " + cost);
		return cost;
	}

}
