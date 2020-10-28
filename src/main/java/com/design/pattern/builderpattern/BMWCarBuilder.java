package com.design.pattern.builderpattern;

public class BMWCarBuilder extends CarBuilder {
	@Override
	public void setShape(String shape) {
		this.car.setShape(shape);
	}

	@Override
	public void setColor(String color) {
		this.car.setColor(color);
	}
}
