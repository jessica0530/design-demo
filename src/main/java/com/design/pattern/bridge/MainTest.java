package com.design.pattern.bridge;

import com.design.pattern.builderpattern.BMWCarBuilder;
import com.design.pattern.builderpattern.CarBuilder;

public class MainTest {
	public static void main(String[] args) throws Exception{
		Shape redCircle = new Circle(100,100,10,new RedCircle());
		Shape greenCircle = new Circle(100,100,10,new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}
}
