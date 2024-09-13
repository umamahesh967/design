package com.designPatterns.structuralDesignPattern.proxy;

import javafx.geometry.Point2D;

/**
 * Spring uses Proxy Pattern for providing support for features like Transactions, Caching and general AOP support.
 *
 * Also look at the examples in Design Pattern PDF Summary.
 *
 * Below is the example of virtual/static proxy.
 */
public class Client {

	public static void main(String[] args) {
		Image img = ImageFactory.getImage("A1.bmp");
		
		img.setLocation(new Point2D(10,10));
		System.out.println("Image location :"+img.getLocation());
		System.out.println("rendering image now.....");
		img.render();
	}

}
