package com.kishan.spring.basics.First.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
     
	//loosely coupled\
	//Autowiring by name (exp : bubbleSortAlgorithm earlier it was sortAlgorithm)
	@Autowired
	 private SortAlgorithm bubbleSortAlgorithm;
	//Note:@primary has more preference than name.
	 
	/*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/
     
	//if we also not make setter injection then no impact
	/*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/


	public int binarySearch(int[] numbers, int numberToSearchFor) {
        
		//sorting logic
		//Tight Coupling
		/*BubbleSortAlgorithm bubblesort = new BubbleSortAlgorithm();
		int[] sortednumbers = bubblesort.sort(numbers);*/
		
		//looselycoupled
		int[] sortednumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		//search
		return 3;
	}

	
}
