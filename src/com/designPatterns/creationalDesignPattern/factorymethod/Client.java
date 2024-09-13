package com.designPatterns.creationalDesignPattern.factorymethod;

import com.designPatterns.creationalDesignPattern.factorymethod.message.Message;

/**
 *
 * We want to move object creation from our code to a separate class
 *
 * We use this pattern when we do not know in advance which class we may need to instantiate beforehand.
 * And also to allow new classes to be added to the system and handle their creation without
 * affecting the client code.
 *
 * Use factory method pattern when you want to delegate object instantiation to subclasses,
 * you’d want to do this when you have “product” inheritance hierarchy and possibility of
 * future additions to that.
 *
 * We let subclasses decide which object to instantiate by overriding the factory method.
 *
 * JDK example for FactoryMethod Pattern
 * @see {@link java.util.AbstractCollection#iterator()}
 */
public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
