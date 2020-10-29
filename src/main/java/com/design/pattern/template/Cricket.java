package com.design.pattern.template;

public class Cricket extends Game{
	@Override
	void initialize() {
		System.out.println("true = " + true);
		
	}

	@Override
	void startPlay() {
		System.out.println("true = " + true);
	}

	@Override
	void endPlay() {
		System.out.println("true = " + true);
	}
}
