package com.design.pattern.template;

public abstract class Game {
	abstract  void initialize();
	abstract  void startPlay();
	abstract  void endPlay();

	//模板
	public final void play(){
		//初始化游侠
		initialize();;
		//开始游戏
		startPlay();
		//结束游侠
		endPlay();
	}
}
