package com.vstl.oopsConcept;

public class ICICBank extends HDFCBank {
	
	public String strIcicBankCreditsMoney = "Credit";
	public String strIcicBankDebitsMoney = "Debit";
	
	public void getIcicBankMoneyCreditDetails() {
		
		System.out.println("ICIC Bank Credits the money :" +strIcicBankCreditsMoney);
	}

    public void getIcicBankMoneyDebitDetails() {
		
		System.out.println("ICIC Bank Debits the money :" +strIcicBankDebitsMoney);
    }
    
    public void getDetailsOfBanks() {
    	
    	this.getHdfcBankGivingLoan();
    	this.getHdfcGivingAnLoan();
    	this.getIcicBankMoneyCreditDetails();
    	this.getIcicBankMoneyDebitDetails();
    	
    }
}
