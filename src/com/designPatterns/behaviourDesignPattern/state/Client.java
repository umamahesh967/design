package com.designPatterns.behaviourDesignPattern.state;

/**
 * @see javax.faces.lifecycle.LifeCycle#execute()
 * (controlled by the FacesServlet: behavior is dependent on current phase (state) of JSF lifecycle)
 */
public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        
        order.paymentSuccessful();
        order.dispatched();
        
        order.cancel();
    }
}
