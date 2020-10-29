package com.design.pattern.template;

import com.design.pattern.singleton.Singleton;

public class MainTest {
	public static void main(String[] args) throws Exception{
		Game game = new Cricket();
		game.play();
		game = new Football();
		game.play();
	}
}
