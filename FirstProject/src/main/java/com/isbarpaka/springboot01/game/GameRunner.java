package com.isbarpaka.springboot01.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class GameRunner {
	GamingConsole game;
	public GameRunner(@Qualifier("PacManqualifier")GamingConsole game){
		this.game=game;
	}
	
	public void action() {
		System.out.println("Runing Game "+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
