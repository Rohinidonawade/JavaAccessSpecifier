package com.vstl.javatraining;

public class StringConcatenation {
	
	public void studentNameAndMarks() {
		String strStudentNameOfVsmClg = "Rohini";
		int intMarksOfRohini = 90;
		String strStudentNameOfKleClg = "Priyanka";
		int intMarksOfPriyanka = 95;
		
		System.out.println(strStudentNameOfVsmClg+intMarksOfRohini+strStudentNameOfKleClg+intMarksOfPriyanka);
		System.out.println(strStudentNameOfVsmClg+intMarksOfRohini+intMarksOfPriyanka);
		System.out.println(intMarksOfRohini+intMarksOfPriyanka+strStudentNameOfVsmClg);
		System.out.println(intMarksOfRohini+intMarksOfPriyanka+strStudentNameOfVsmClg+intMarksOfPriyanka);

	}
	

}
