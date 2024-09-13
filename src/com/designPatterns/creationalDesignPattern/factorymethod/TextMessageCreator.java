package com.designPatterns.creationalDesignPattern.factorymethod;

import com.designPatterns.creationalDesignPattern.factorymethod.message.Message;
import com.designPatterns.creationalDesignPattern.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
