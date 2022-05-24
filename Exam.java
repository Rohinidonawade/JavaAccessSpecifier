package com.vstl.oopsConcept;

public class Exam extends CollageStudent {
	
	public double doublePercentage;
	
	public void getStudentExamMarks() {
		
		int intScienceExamMarks = 60;
		int intMathsExamMarks = 77;
		int intSocialScienceExamMarks = 65;
		
		doublePercentage = (intScienceExamMarks+intMathsExamMarks+intSocialScienceExamMarks)*100/300;
		System.out.println("The Percentage is : " +doublePercentage);
	}
	
	public void getStudentExamDetails() {
		this.getStudentName();
		this.getStudentRollNumber();
		this.getStudentExamMarks();
	}
}
