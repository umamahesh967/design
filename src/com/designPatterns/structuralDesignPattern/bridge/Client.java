package com.designPatterns.structuralDesignPattern.bridge;

import java.util.Collections;
import java.util.Map;

/**
 * Using Bridge pattern we can decouple Abstraction and Implementation so that they can both
 * change without affecting each other.
 *
 * We can achieve this feet by creating two separate inheritance hierarchies; one for implementation
 * and another for abstraction.
 *
 * We can can use composition to bridge these two hierarchies.
 * https://manh.udemy.com/course/design-patterns-in-java-concepts-hands-on-projects/learn/lecture/9587858#overview
 *
 * {@link Collections#newSetFromMap(Map)}
 *
 * How is newSetFromMap uses Map internally.
 * Map(Implementor)
 * Set(Abstraction)
 * SetFromMap(Concrete Abstraction)
 *
 * Here both abstraction and Implementor grows independently.
 * When we add new methods in Set(Abstraction) we don't need to make any changes to Map.
 * When we make any changes in Map(Implementor) we don't need to make any changes to Set.
 */
public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
		collection.offer(10);
		collection.offer(40);
		collection.offer(99);
		
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());

		//
		System.out.println(collection.poll());

	}

}
