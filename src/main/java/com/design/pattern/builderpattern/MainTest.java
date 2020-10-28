package com.design.pattern.builderpattern;

import com.design.pattern.factory.BMWFactory;
import com.design.pattern.factory.Car;
import com.design.pattern.factory.Factory;

public class MainTest {
	public static void main(String[] args) throws Exception{
		CarBuilder builder = new BMWCarBuilder();
		builder.setShape("流体形");
		builder.setColor("黑色");
	}
}
