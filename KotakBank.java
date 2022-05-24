package com.vstl.oopsConcept;

public class KotakBank extends ICICBank {
	
	public String strKotakBankGivingFunds = "Mutual Funds";
	
	public void getFundsInKotakBank() {
		
		System.out.println("Kotak Bank Funds :" +strKotakBankGivingFunds);
	}
	
	public void getAllBankDetials() {
		
		this.getHdfcBankGivingLoan();
		this.getHdfcGivingAnLoan();
		this.getIcicBankMoneyCreditDetails();
		this.getIcicBankMoneyDebitDetails();
		this.getFundsInKotakBank();
	}

}


