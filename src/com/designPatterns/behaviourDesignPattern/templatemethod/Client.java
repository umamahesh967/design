package com.designPatterns.behaviourDesignPattern.templatemethod;

import java.io.IOException;
import java.util.Collection;

/**
 * Java.io has a read() method in InputStream that subclasses must implement
 * and is used by the template method read(byte b[], int off, int len).
 * @see java.io.InputStream#read()
 *
 * @see java.util.AbstractSet#removeAll(Collection) //Template method
 * @see java.util.AbstractSet#remove(Object) //Above template method uses this method. Which child classes must implement.
 *
 * Above AbstractSet#removeAll() method uses remove(), size(), iterator() abstarct methods which are implemented in child classes.
 *
 * See examples in head First design pattern book for Template Method
 *
 * https://www.geeksforgeeks.org/template-method-design-pattern/
 *
 * Arrays.sort(Object[] arr) is also example for Template Method design pattern in a different way then normal Template Method pattern
 */
public class Client {

	public static void main(String[] args) throws IOException {
		Order order = new Order("1001");
		
		order.addItem("Soda", 2.50);
		order.addItem("Sandwitch", 11.95);
		order.addItem("Pizza", 15.95);
		
		OrderPrinter printer = new HtmlPrinter();
		printer.printOrder(order, "1001.html");
	}
}
