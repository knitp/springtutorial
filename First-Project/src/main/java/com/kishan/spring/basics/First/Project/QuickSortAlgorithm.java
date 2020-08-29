package com.kishan.spring.basics.First.Project;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // to given importance to Quicksort
public class QuickSortAlgorithm implements SortAlgorithm{
   
	public int[] sort(int[] numbers)
	{  
		//logic
		return numbers;
	}
}
