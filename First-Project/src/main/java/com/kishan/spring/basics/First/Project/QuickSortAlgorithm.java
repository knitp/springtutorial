package com.kishan.spring.basics.First.Project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // to given importance to Quicksort
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
   
	public int[] sort(int[] numbers)
	{  
		//logic
		return numbers;
	}
}
