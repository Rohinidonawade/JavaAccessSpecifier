package com.vstl.javatraining;

public class MultiDimensionalArray {
	
	public void getStudentMarksUsingMultiDimensionalArray() {
		
		int intMarksStudent[][] = {{60,50,75,80},
		                            {80,69,75,89},
		                           {55,99,75,89}}; 
		
		int [][] intMarksOfScienceStudent = new int[3][4];
		
		intMarksOfScienceStudent [0][0] = 60;
		intMarksOfScienceStudent [0][1] = 50;
		intMarksOfScienceStudent [0][2] = 75;
		intMarksOfScienceStudent [0][3] = 80;

		intMarksOfScienceStudent [1][0] = 80;
		intMarksOfScienceStudent [1][1] = 69;
		intMarksOfScienceStudent [1][2] = 75;
		intMarksOfScienceStudent [0][3] = 89;
		
		intMarksOfScienceStudent [2][0] = 55;
		intMarksOfScienceStudent [2][1] = 99;
		intMarksOfScienceStudent [2][2] = 75;
		intMarksOfScienceStudent [2][3] = 89;


		System.out.println("The Array is" +intMarksOfScienceStudent[0][0]);
		System.out.println("The Array is" +intMarksOfScienceStudent[1][2]);
		System.out.println("The Array is" +intMarksOfScienceStudent[2][3]);
		
		//System.out.println("The Array is" +intMarksOfScienceStudent[3][3]); Give an exception

	}
}


