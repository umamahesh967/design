package com.designPatterns.behaviourDesignPattern.observer;

/**
 * JDK by default ships with Observer Interface and Observable Class
 * {@link java.util.Observable} acts as Subject
 * {@link java.util.Observer} acts as observer
 *
 * Spring also supports Observer through the ApplicationListener Interface.
 */
public class Client {

    public static void main(String[] args) {
    	Order order = new Order("101");
    	PriceObserver price = new PriceObserver();
    	order.attach(price);
    	
    	QuantityObserver quant = new QuantityObserver();
    	order.attach(quant);
    	
    	order.addItem(50);
    	order.addItem(179);
    	
    	System.out.println(order);
    }
}
