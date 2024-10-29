package com.isbarpaka.springboot01.game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Configuration
@ComponentScan("com.isbarpaka.springboot01.game")
public class GameLuncher {
	public static void main(String[] args) {
		
		var context=new AnnotationConfigApplicationContext(GameLuncher.class);
		context.getBean(GameRunner.class).action();

	}

}
