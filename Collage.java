package com.vstl.oopsConcept;

public class Collage extends Student{
		
	public void getCollageName() {
		String strCollageName = "KLE Collage";
		System.out.println("Collage name is :" +strCollageName);
		
	}
	
	public void getCollageGrade() {
		char charGrade = 'B';
		System.out.println("Collage Grade is :" +charGrade);
		
	}
	
	public void getStudentDetailsAndCollageDetails() {
		
		this.getStudentName();
		this.getRollNumber();
		this.getCollageName();
		this.getCollageGrade();
	}

}
