package com.designPatterns.structuralDesignPattern.facade.email;

//import com.coffeepoweredcrew.facade.email.Template.TemplateType;

public class TemplateFactory {

	public static Template createTemplateFor(Template.TemplateType type) {
		switch (type) {
		case Email:
			return new OrderEmailTemplate();
		default:
			throw new IllegalArgumentException("Unknown TemplateType");
		}
		
	}
}
