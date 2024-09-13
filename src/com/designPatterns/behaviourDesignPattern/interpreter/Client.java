package com.designPatterns.behaviourDesignPattern.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

	public static void main(String[] args)
	{
		Report report1  = new Report("Cashflow repot", "FINANCE_ADMIN OR ADMIN");
		ExpressionBuilder builder = new ExpressionBuilder();

		PermissionExpression exp = builder.build(report1);
		System.out.println(exp);
		User user1 = new User("Dave", "USER");
		System.out.println("USer access report:"+ exp.interpret(user1));


		//Examples
		Pattern pattern = Pattern.compile("abcds", Pattern.CASE_INSENSITIVE); // Here Syntax tree is created
		Matcher matcher = pattern.matcher("abcds edfes"); //Here we just creating matcher object
		if(matcher.find()) //When we call find on mather, here actual search happens.
		{
			System.out.println(matcher.group());
		}
	}

}
