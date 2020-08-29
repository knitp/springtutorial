package com.kishan.spring.basics.First.Project;

public class BinarySearchImpl {
     
	//loosely coupled
	 private SortAlgorithm sortAlgorithm;
	 
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

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
