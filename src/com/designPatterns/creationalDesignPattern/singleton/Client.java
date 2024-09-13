package com.designPatterns.creationalDesignPattern.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * JDK example for Singleton Pattern
 *
 * {@link Runtime#getRuntime()}
 *
 * @see java.lang.Runtime#getRuntime()
 * @see java.awt.Desktop#getDesktop()
 * @see java.lang.System#getSecurityManager()
 */
public class Client implements Serializable {

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		LazyRegistryIODH singleton;

//		singleton = LazyRegistryIODH.getInstance();

		System.out.println(EagerRegistry.getInstance());

		Constructor<EagerRegistry> constructor =  EagerRegistry.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		System.out.println(constructor.newInstance());


//		LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
//		System.out.println(singleton == singleton2);



	}


}
