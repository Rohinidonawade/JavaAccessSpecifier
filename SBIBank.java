package com.vstl.oopsConcept;

public class SBIBank implements USBank,BrazilBank {
	
	   //Overriding from USBank
	
	public void intMinBalance() {
		
		System.out.println("SBI intMinBalance");
	}
	
	public void strCredits() {
		
		System.out.println("SBI strCredits");

	}
	
	public void strDebits() {
		
		System.out.println("SBI Debits");
	}
	
         //Overriding from BrazilBank
	
	public void intMinWithDrow() {
		
		System.out.println("SBI minWithDrow");
	}
	
	public void strFunds() {
		
		System.out.println("SBI Funds");
	}
	
    public void strMutualFunds() {
		
		System.out.println("SBI strMutualFunds");
	}

}
