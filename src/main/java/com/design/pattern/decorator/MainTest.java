package com.design.pattern.decorator;

import com.design.pattern.factory.BMWFactory;
import com.design.pattern.factory.Car;
import com.design.pattern.factory.Factory;

public class MainTest {
	public static void main(String[] args) throws Exception{
		Shape circle = new Circle();
		ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
		ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

		circle.draw();

		redCircle.draw();

		redRectangle.draw();
	}
}
