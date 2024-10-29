package com.isbarpaka.springboot01.example.a1;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;




@Component
class YourBusiness{
	@Autowired
	Dependency1 dependency1;
	@Autowired
	Dependency2 dependency2;
	public String toString() {
		return "Kanhaiya "+ dependency1 +" Satya "+dependency2;
	}
	
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}
@Configuration
@ComponentScan
public class DepInjectionLuncher01 {
	
	    public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(DepInjectionLuncher01.class);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println(context.getBean(YourBusiness.class));

	}

}
