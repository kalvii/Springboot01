package com.isbarpaka.realworldbased.project01;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class BusinessLauncher {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BusinessLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		} catch (BeansException e) {
			
			e.printStackTrace();
		}

	}

}
