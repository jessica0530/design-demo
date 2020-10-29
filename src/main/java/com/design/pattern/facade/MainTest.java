package com.design.pattern.facade;

import com.design.pattern.decorator.Circle;
import com.design.pattern.decorator.Rectangle;
import com.design.pattern.decorator.RedShapeDecorator;
import com.design.pattern.decorator.Shape;
import com.design.pattern.decorator.ShapeDecorator;

public class MainTest {
	public static void main(String[] args) throws Exception{
		ShapeMaker shapeMarker = new ShapeMaker();
		shapeMarker.drawCircle();
		shapeMarker.drawRectangle();
	}
}
