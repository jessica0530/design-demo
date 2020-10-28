package com.design.pattern.factory;

import com.design.pattern.singleton.Singleton;

public class MainTest {
	public static void main(String[] args) throws Exception{
		Factory bmwFactory = new BMWFactory();
		Car bmw = bmwFactory.createCar();
		bmw.setCarColor("color");
		bmw.setCarColor("red");
	}
}
