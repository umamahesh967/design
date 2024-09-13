package com.designPatterns.structuralDesignPattern.facade;

import com.designPatterns.structuralDesignPattern.facade.email.EmailFacade;

import java.net.URL;

/**
 * {@link URL#openStream()}
 *
 * url.openStream() initiates a new TCP connection to the server that the URL resolves to.
 * An HTTP GET request is then sent over the connection. If all goes right (i.e., 200 OK),
 * the server sends back the HTTP response message that carries the data payload that is served
 * up at the specified URL. You then need to read the bytes from the InputStream that the openStream()
 * method returns in order to retrieve the data payload into your program.
 *
 */
public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade facade = new EmailFacade();
		
		boolean result = facade.sendOrderEmail(order);
		
		System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));

	}

//	private static boolean sendOrderEmailWithoutFacade(Order order) {
//		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		return mailer.send(email);
//	}
	
}
