package com.isbarpaka.realworldbased.project01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MySqlDbDataService implements DataService{
	public int[] retriveveData() {
		return new int[] {1,2,3,4,5};
	}

}
