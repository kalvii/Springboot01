package com.isbarpaka.springboot01.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacManqualifier")
public class PacMan implements GamingConsole {
	public void up() {
		System.out.println("Fire features");
	}
	public void down() {
		System.out.println("Dimond Achivements");
	}
	public void left() {
		System.out.println("Uocoming features");
	}
	public void right() {
		System.out.println("bonuse point click");
	}

}
