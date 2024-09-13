package com.designPatterns.behaviourDesignPattern.strategy;

import java.util.LinkedList;

/**
 * @StrategyPattern is a behavioral software design pattern that enables selecting an algorithm at runtime.
 * Instead of implementing a single algorithm directly, code receives run-time instructions as to which in a
 * family of algorithms to use.
 *
 * {@link java.util.Comparator}
 * We can use multiple implementation of Comparator(Strategy), each using a
 * different algorithm to perform comparison and supply those to various sort methods.
 *
 * Comparator(Strategy)
 * Concrete Comparator(Concrete Strategy)
 * Context is a class which uses a Strategy.
 * Whichever classes are calling Comparator#compare() method those classes are context classes in Strategy Design Pattern.
 */
public class Client {

    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrders();
        //print all orders
        PrintService service = new PrintService(new DetailPrinter());
        service.printOrders(orders);
    }

    private static void createOrders() {
        Order o = new Order("100");
        o.addItem("Soda", 2);
        o.addItem("Chips", 10);
        orders.add(o);

        o = new Order("200");
        o.addItem("Cake", 20);
        o.addItem("Cookies", 5);
        orders.add(o);

        o = new Order("300");
        o.addItem("Burger", 8);
        o.addItem("Fries", 5);
        orders.add(o);
    }
}
