package com.kishan.spring.basics.First.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
     
	//loosely coupled
	@Autowired
	 private SortAlgorithm sortAlgorithm;
	
	 
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
		int[] sortednumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//search
		return 3;
	}

	
}
