package com.isbarpaka.springboot01.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContra implements GamingConsole  {
	public void up() {
		System.out.println("Run up direction");
	}
	public void down() {
		System.out.println("Go Down direction");
	}
	public void left() {
		System.out.println("Go backWard direction");
	}
	public void right() {
		System.out.println("Shoot bullet...");
	}

}
