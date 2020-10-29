package com.design.pattern.facade;

import com.design.pattern.decorator.Circle;
import com.design.pattern.decorator.Rectangle;
import com.design.pattern.decorator.Shape;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;

	public ShapeMaker(){
		circle = new Circle();
		rectangle = new Rectangle();
	}

	public void drawCircle(){
		circle.draw();
	}

	public void drawRectangle(){
		rectangle.draw();
	}
}
