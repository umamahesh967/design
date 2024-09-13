package com.designPatterns.creationalDesignPattern.simplefactory;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Here we simply take this instantiation logic to a separate class and most commonly
 * to a static method of this class.
 *
 * Simple factory is often confused with factory method pattern.
 *
 * Typically we want to create a simple factory where if we have more than one option when instantiating  object and
 * a simple logic is used to choose the correct class.
 *
 * @see {@link NumberFormat#getInstance()}
 * NumberFormat is used to format Number to corresponding locale.
 *
 * Number format uses Locale to convert Number into corresponding currency format or Number format or percent fomat.
 */
public class Client {

	public static void main(String[] args) {
		Post post = PostFactory.createPost("news");
		System.out.println(post);

		//JDK Example of NumberFormat
		NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.ITALY);
		System.out.println(numberFormat.format(456123456.780));

		NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(currencyInstance.format(456123456.780));

		NumberFormat integerInstance = NumberFormat.getIntegerInstance(Locale.ITALY);
		System.out.println(integerInstance.format(456123456.780));

		NumberFormat percentInstance = NumberFormat.getPercentInstance(Locale.ITALY);
		System.out.println(percentInstance.format(456123456.780));
	}

}
