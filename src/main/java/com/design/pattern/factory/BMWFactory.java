package com.design.pattern.factory;

public class BMWFactory implements Factory{
	@Override
	public Car createCar() {
		return new BMWCar();
	}
}
