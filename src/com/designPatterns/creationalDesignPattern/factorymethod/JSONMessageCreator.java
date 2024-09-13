package com.designPatterns.creationalDesignPattern.factorymethod;

import com.designPatterns.creationalDesignPattern.factorymethod.message.JSONMessage;
import com.designPatterns.creationalDesignPattern.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
