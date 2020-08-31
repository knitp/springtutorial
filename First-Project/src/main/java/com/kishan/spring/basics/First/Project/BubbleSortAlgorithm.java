package com.kishan.spring.basics.First.Project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
   
	public int[] sort(int[] numbers)
	{  
		//logic
		return numbers;
	}
}
