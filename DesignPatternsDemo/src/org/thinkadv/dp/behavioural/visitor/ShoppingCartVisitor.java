package org.thinkadv.dp.behavioural.visitor;

public interface ShoppingCartVisitor {
	int visit(Book book);
    int visit(Fruit fruit);
}
