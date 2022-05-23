package com.vstl.javatraining;

public class OneDimensionalArray {
	
	public void getArrayDataUsingOneDimensionalArray() {
		
		// one dimensional array
		int intArray[] = {100,200,300,400,500,600,700,800,900,10000};
		System.out.println("1st array is:" +intArray[0]);
		System.out.println("2nd array is:" +intArray[1]);
		System.out.println("3nd array is:" +intArray[2]);
		System.out.println("6th array is:" +intArray[5]);
		System.out.println("10th array is:" +intArray[9]);
		
	//System.out.println("10th array:" +intArray[10]); //it will give an Array out OfBound exception.	
	}
	
}
