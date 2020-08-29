package com.kishan.spring.basics.First.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		 
		//tightly coupled 
		//BinarySearchImpl binarysearch = new BinarySearchImpl()
		//loosely coupled 
		BinarySearchImpl binarysearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarysearch.binarySearch(new int []{1,2,3,4,5},4);
		System.out.println(result);
		SpringApplication.run(FirstProjectApplication.class, args);
	}

}
