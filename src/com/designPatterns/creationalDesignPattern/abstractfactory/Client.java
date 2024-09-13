package com.designPatterns.creationalDesignPattern.abstractfactory;

import com.designPatterns.creationalDesignPattern.abstractfactory.aws.AwsResourceFactory;
import com.designPatterns.creationalDesignPattern.abstractfactory.gcp.GoogleResourceFactory;
import com.designPatterns.creationalDesignPattern.abstractfactory.Instance.Capacity;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;

/**
 *
 * Abstract Factory is used when we have two or more objects which work together forming a kit or set
 * and there can be multiple sets or kits that can be created by client code.
 *
 * So we separate the client code from concrete objects forming such a set and also from the code
 * which creates these sets.
 *
 * When you want to constrain object creations so that they all work together then abstract factory
 * is good design pattern.
 *
 * Each abstract method defined in Abstract Factory is considered as factory method.
 *
 *
 * In AbstractFactory we are hiding factories as well as concrete objects(Products) from the client code.
 * We are saying we are abstracting the factories because here the client will work with factory Interface.
 * In each abstract factory we have different set of products.
 *
 * Where as in case of factory pattern here we are abstracting the product(Concrete Object). Here client
 * will work with abstract product.
 *
 * @Design Considerations
 * https://manh.udemy.com/course/design-patterns-in-java-concepts-hands-on-projects/learn/lecture/9582698#overview
 *
 *
 * JDK example for FactoryMethod Pattern
 *
 * An example of the Abstract Factory design pattern in the JDK is the newInstance() of javax.xml.parsers.DocumentBuilderFactory class.
 *
 * @see {@link javax.xml.parsers.DocumentBuilderFactory#newInstance()}
 *
 * {@link javax.xml.transform.TransformerFactory#newInstance()}
 *
 * {@link javax.xml.xpath.XPathFactory#newInstance()}
 *
 * *****{@link java.util.prefs.PreferencesFactory}**** Good Example Matches close with UML.
 * generates Preferences objects with respect System and User
 *
 */
public class Client {

	private ResourceFactory factory;

	public Client(ResourceFactory factory) {
		this.factory = factory;
	}

	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}

	public static void main(String[] args) throws TransformerConfigurationException, ParserConfigurationException {
		Client aws = new Client(new AwsResourceFactory());
		Instance i1 = aws.createServer(Capacity.micro, 20480);
		i1.start();
		i1.stop();

		System.out.println("***************************************");
		Client gcp = new Client(new GoogleResourceFactory());
		i1 = gcp.createServer(Capacity.micro, 20480);
		i1.start();
		i1.stop();

	}
}
