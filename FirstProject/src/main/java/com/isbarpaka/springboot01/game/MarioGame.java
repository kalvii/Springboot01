package com.isbarpaka.springboot01.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component

public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Go up");
	}
	public void down() {
		System.out.println("Go Down way");
	}
	public void left() {
		System.out.println("Go left way");
	}
	public void right() {
		System.out.println("Go right way");
	}

}
