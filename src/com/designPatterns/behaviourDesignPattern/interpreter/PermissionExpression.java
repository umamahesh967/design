package com.designPatterns.behaviourDesignPattern.interpreter;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user);
}
