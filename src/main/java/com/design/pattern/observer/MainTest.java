package com.design.pattern.observer;

import com.design.pattern.factory.BMWFactory;
import com.design.pattern.factory.Car;
import com.design.pattern.factory.Factory;

public class MainTest {
	public static void main(String[] args) throws Exception{
		Subject subject = new Subject();

		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
