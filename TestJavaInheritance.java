package com.vstl.oopsConcept;

public class TestJavaInheritance {

	public static void main(String[] args) {
		
		     // 1. Single Inheritance.
		Collage objCollage = new Collage();
		objCollage.getStudentDetailsAndCollageDetails();
		
		         System.out.println("************");
			
		     // 2. Multilevel Inheritance.
		KotakBank objKotakBank = new KotakBank();
		objKotakBank.getAllBankDetials();
		
		        System.out.println("************");
		
		     //3.Hierarchical
		Car objCar = new Car();
		objCar.getAllCarDetails();
		
		        System.out.println("************");
		
		     //4. Multiple 
	    SBIBank objSBIBank = new SBIBank();
		objSBIBank.intMinBalance();
		objSBIBank.intMinWithDrow();
		objSBIBank.strCredits();
		objSBIBank.strDebits();
		objSBIBank.strFunds(); 
		        
				System.out.println("************");
		
		     //5. Hybrid
		Result objResult = new Result();
		objResult.getExamAndProjectDetails();
		
	}
}

