package com.designPatterns.structuralDesignPattern.adapter;

import java.util.Arrays;

/**
 *
 * We have an existing object which provides some functionality that client needs. But client node can't use this object
 * because it expects an object with different interface.
 *
 * We have Class Adapter and Object Adapter.
 *
 * {@link java.io.InputStreamReader} && {@link java.io.OutputStreamWriter}
 * Both the above class adapt {@link java.io.InputStream}/{@link java.io.OutputStream}(Adaptee) to a {@link java.io.Reader}/{@link java.io.Writer}(Target Interface) interface.
 *
 * {@link Arrays#asList(Object[])} //Here the target interface is List and all operation are performed on Object[]
 */
public class Main {

	public static void main(String[] args) {
		/** Using Class/Two-way adapter **/
		//Class Adapter is also called two way adapter because since it can stand for both Target interface and Adaptee.
		EmployeeClassAdapter adapter  = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card  = designer.designCard(adapter);
		System.out.println(card);

		System.out.println("************************************************************");
		/** Using Object Adapter **/
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
		card = designer.designCard(objectAdapter);
		System.out.println(card);
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
