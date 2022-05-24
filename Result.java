package com.vstl.oopsConcept;

public class Result extends Exam implements Project{
	
	public void getExamDetails() {
		this.getStudentName();
		this.getStudentExamMarks();
		this.getStudentRollNumber();	
	}
	
	public void strProjectName() {
		System.out.println("Project Water Falls");
	}
	
	public void intTakenDaysToCompletion() {
		System.out.println("Project Taken 30Days");
	}
	
	public void getExamAndProjectDetails() {
		 
		System.out.println("Student Name is :" +strStudentName);
		System.out.println("Roll Number is :" +intRollNumber);
		System.out.println("Percentage is :" +doublePercentage);
		System.out.println("Project Name is :" +strProjectName);
		System.out.println("Project taken time is :" +intTakenDaysToCompletion);
			
	}
}
