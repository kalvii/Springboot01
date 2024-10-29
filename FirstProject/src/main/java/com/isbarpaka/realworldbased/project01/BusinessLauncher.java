package com.isbarpaka.realworldbased.project01;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class BusinessLauncher {

	public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(BusinessLauncher.class);
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(BusinessCalculationService.class).findMax());

	}

}
