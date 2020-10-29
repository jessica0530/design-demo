package com.design.pattern.strategy;

import com.design.pattern.template.Cricket;
import com.design.pattern.template.Football;
import com.design.pattern.template.Game;

public class MainTest {
	public static void main(String[] args) throws Exception{
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
	}
}
