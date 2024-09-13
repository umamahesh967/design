package com.designPatterns.structuralDesignPattern.decorator;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * new BufferedOutputStream(new FileOutputStream("ac.txt"));
 * In above example {@link java.io.FilterOutputStream} is the decorator
 * and {@link java.io.BufferedOutputStream} is the concrete decorator
 * and {@link java.io.FileOutputStream} is the concrete implementation of {@link java.io.OutputStream}
 *
 * {@link java.util.Collections#synchronizedList(List)}  //Here SynchronizedList provides additional functionality by having synchronization on List methods.
 *  * {@link java.util.Collections#synchronizedMap(Map)}
 *   * {@link java.util.Collections#synchronizedSet(Set)}
 */
public class Client {

	public static void main(String[] args) {
		Message m = new TextMessage("The <FORCE> is strong with this one!");
		System.out.println(m.getContent());

		Message decorator = new HtmlEncodedMessage(m);
		System.out.println(decorator.getContent());
		
		decorator = new Base64EncodedMessage(decorator);
		System.out.println(decorator.getContent());
	}
}
