package com.isbarpaka.realworldbased.project01;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
	
	private DataService dataService;

	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService=dataService;
		}
	public int findMax() {
		return Arrays.stream(dataService.retriveveData()).max().orElse(0);
	}
	

}
