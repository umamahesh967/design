package com.designPatterns.creationalDesignPattern.factorymethod;

import com.designPatterns.creationalDesignPattern.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 *
 * Here Factory method can be Concrete method also with some default Object created. If we don't want that object we
 * can override that method in subclass for new Different Object Creation
 *
 * We typically end up with a concrete creator per object type.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}
	
	//Factory method
	protected abstract Message createMessage();
}
