package com.designPatterns.creationalDesignPattern.singleton;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that, we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazyRegistryIODH
{

	private LazyRegistryIODH() {
		System.out.println("In LazyRegistryIODH singleton");
	}

	/**
	 *  This is singleton because, here RegistryHolder is loaded once and when it is loaded then itself
	 *  the INSTANCE Variable is initialized.
	 *
	 * 	So even though two threads call get instance method, since class is loaded once and
	 * 	static variable is assigned at the time of class loading there will always be only single instance created.
	 */
	private static class RegistryHolder {
		static LazyRegistryIODH INSTANACE = new LazyRegistryIODH();
	}
	
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANACE;
	}
}
