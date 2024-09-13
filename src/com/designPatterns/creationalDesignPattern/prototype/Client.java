package com.designPatterns.creationalDesignPattern.prototype;

import javafx.geometry.Point3D;

/**
 *
 * So whenever we are in a situation where we have an object and creating that object is costly operation
 * and the cost maybe the performance cost or maybe some calculation is needed to create that object or the
 * cost may be related to using external resources which are not in our control.
 *
 * So whenever we have such an object, then to create multiple instances. We use that
 * single object or existing object as our prototype. And this pattern allows us to make copies of
 * that existing instance and it saves us from creating these instances from scratch.
 *
 * @Considerations while designing
 * - Pay attention to the deep copy and shallow copy of reference. Immutable fields on clones
 * save the trouble of deep copy.
 *
 * If our clone object contains immutable objects we can do shallow copy. But if it contains mutable objects then we
 * should do deep copy or else fields inside cloned object and main object point to same reference
 * and we might face issues.
 *
 * Also when returning the cloned copy make sure to reset the object state.
 * Clone() method is protected in object class and must be overridden to public to make it callable from outside class.
 *
 * Cloneable is marker interface that supports cloning. If we don't implement Cloneable and call clone method then
 * we get CloneNotSupportedException.
 *
 * Prototype design pattern is useful when you have large object where majority of the object state remains
 * unchanged between object instances.
 *
 * Prototype design pattern is useful when working with Composite and Decorator design pattern.
 *
 */
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10,0,0), 20);
        s1.attack();
        
        System.out.println(s1);
        Swordsman s2 = (Swordsman)s1.clone();
        System.out.println("Cloned swordsman"+s2);

	}
}