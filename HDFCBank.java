package com.vstl.oopsConcept;

public class HDFCBank {
	
	//2.Multilevel:-there is a chain of inheritance, the class extends class and it extends another class.
		
	public String strHdfcBankLoan = "CarLoan";
	public String strHdfcBankGivingAnotherLoan = "HomeLoan";
	
	public void getHdfcBankGivingLoan() {
				
		System.out.println("HDFC gives a loan :" +strHdfcBankLoan);
		
	}
	
	public void getHdfcGivingAnLoan() {
		
		System.out.println("HDFC gives a loan :" +strHdfcBankGivingAnotherLoan);
	}
	
}
