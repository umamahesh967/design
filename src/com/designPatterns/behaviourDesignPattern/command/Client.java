package com.designPatterns.behaviourDesignPattern.command;

/**
 * The command pattern encapsulates a request as an object, thereby letting us parameterize other
 * objects with different requests, queue or log requests, and support undoable operations.
 *
 * Command allows us to represent an operation/request/method-call as object.
 *
 * In command pattern there is a Command object that encapsulates a request by binding together a set
 * of actions on a specific receiver. It does so by exposing just one method execute() that causes some
 * actions to be invoked on the receiver.
 *
 * In simple terms When we want to encapsulate an object(Receiver) that performs an action(Receiver method). We create command
 * object and pass receiver object to command constructor. We can pass this command to wherever we want and execute this at
 * any place. The object which invokes that method on command is called Invoker.
 *
 * JDK Example of Command are
 * @see Runnable
 *
 * In above example Runnable(Command Interface), Class implementing Runnable(Concrete Command)
 * In concrete class run() method we perform some operation on Receiver
 * We can send this object for later execution to other parts of our application.
 * Thread class is the Invoker with start() method calling ConcreteCommand implementaiton ( which calls run() method)
 *
 * How @Runnable is example for Command Design Pattern
 * https://stackoverflow.com/questions/35610215/java-command-pattern-example-with-runnable-class-is-receiver-missing#:~:text=lang.,which%20implements%20abstract%20Command%20method.
 *
 */
public class Client {

	public static void main(String[] args) throws InterruptedException {
		EWSService service = new EWSService();
		
		Command c1 = new AddMemberCommand("a@a.com", "spam", service);
		MailTasksRunner.getInstance().addCommand(c1);

		Command c2 = new AddMemberCommand("b@b", "spam", service);
		MailTasksRunner.getInstance().addCommand(c2);
		
		Thread.sleep(3000);
		MailTasksRunner.getInstance().shutdown();
	}

}
