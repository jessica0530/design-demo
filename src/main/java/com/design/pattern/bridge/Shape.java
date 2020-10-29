package com.design.pattern.bridge;

/**
 * 使用DrawApi 接口创建抽象类
 */
public abstract class Shape {
	protected  DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	public abstract void draw();
}
