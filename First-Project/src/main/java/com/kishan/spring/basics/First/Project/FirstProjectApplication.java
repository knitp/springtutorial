package com.kishan.spring.basics.First.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		 
		//what are the beans which spring framework need to manage? -->@Component
		//what are dependencies of bean? -->@Autowird
		//where to search for beans? --> if same package then none
		//tightly coupled 
		//BinarySearchImpl binarysearch = new BinarySearchImpl()
		//loosely coupled 
		/*BinarySearchImpl binarysearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarysearch.binarySearch(new int []{1,2,3,4,5},4);
		System.out.println(result);*/
		
		//Spring Framerwork used now
		//Application context
		ApplicationContext applicationContext = SpringApplication.run(FirstProjectApplication.class, args);
		BinarySearchImpl binarysearch= applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarysearch1= applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarysearch);
		System.out.println(binarysearch1);
		int result = binarysearch.binarySearch(new int []{1,2,3,4,5},4);
		System.out.println(result);
	}

}
