package com.vstl.javatraining;

public class TestJavaLoops {

	public static void main(String[] args) {
		    //1.for loop
		JavaForLoop objJavaForLoop = new JavaForLoop();
		objJavaForLoop.trainingEmployeeNameList();
		        System.out.println("*********");
		    
		objJavaForLoop.trainingEmployeeList();
	            System.out.println("*********");
	            

	         //2.while loop
	    JavaWhileLoop objJavaWhileLoop = new JavaWhileLoop();
	    objJavaWhileLoop.rainingInTheCities();
	            System.out.println("*********");
	         
	    objJavaWhileLoop.rainingInTheCitiesInKarnatakaState();
                System.out.println("*********");

	    
	        //3.Do while loop
	    DoWhileLoop objDoWhileLoop = new DoWhileLoop();
	    objDoWhileLoop.doctorsInTheBelgaumCity();
                System.out.println("*********");
		
		objDoWhileLoop.hospitalNamesInBelgaum();
	
	}
}


