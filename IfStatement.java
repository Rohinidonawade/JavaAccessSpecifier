package com.vstl.javatraining;

public class IfStatement {

	//1. simple if statement
	
	public void collageStudentList() {
		int intScienceStudentList = 100;
		int intArtsStudentList = 150;
		int intCommerceStudentList = 90;
		
		int inttotallStudentList = intScienceStudentList + intArtsStudentList + intCommerceStudentList;
		
		if (inttotallStudentList > 300) {
			System.out.println("The total students list get display:" +inttotallStudentList);
		}
	}
	
	// 2.if else statement
	
	public void belgaumCovidPatient() {
		int intRecoverdPatient = 100;
		int intNotRecoveredPatient = 25;
		
		if(intRecoverdPatient > intNotRecoveredPatient) {
			System.out.println("The Recovered patient is high");
		}
		else {
			System.out.println("The Recovered patient is low");
		}
	}
	
	// 3.if-else-if ladder :- contains the multiple else-if statement
	 
	public void governmentExamMerritList() {
		double doubleMarks = 30.5;
		
		if(doubleMarks>=50.5) {
			System.out.println("Candidate selected for First grade post");
		}
		else if(doubleMarks>40) {
			System.out.println("Candidate selected for secound grade post");
		}
		else {
			System.out.println("Candidate Not selected");
		}
		
	}
	
	//4. Nested if statement
	
	public void collageStudentExamRanking() {
		int intBiology = 75;
		int intMaths = 88;
		int intChemisty = 70;
		int intPhysics = 80;
		
		int intpercentage = (intBiology+intMaths+intChemisty+intPhysics)*100/400;
		
		if(intpercentage<100) {
			System.out.println("1st Rank in Exam");
		}
		if(intpercentage>100) {
			System.out.println("2nd Rank in Exam");
		}else {
			System.out.println("No number in the exam");
		}
		
	}
}
	
	


