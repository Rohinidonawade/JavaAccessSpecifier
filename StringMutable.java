package com.vstl.stringEx;

public class StringMutable {
	
	public void getDaysInAWeek() {
		
//Buffer:- we will use it because it will not impact on other obj.Bcz Strings are immutable so we will use Buffer to make it mutable
		//thread safe.
		     //APPEND
		
		String strArray[]= {"Sun","Mon","The","Web","Thur","Fri","Sat"};
		
		StringBuffer strDays = new StringBuffer("Sun");
		strDays.append(" Mon");
		strDays.append('T');
		
		System.out.println(strDays);
	}

	        //delete
	public void getStudentName() {
		String strStudentName = "Suresh";
		
		StringBuffer strName = new StringBuffer("Suresh");
		strName.charAt(4);
		strName.delete(0, 4);
		System.out.println(strName);
	}
	
	       //INSERTED INTO THE INDEX TO SOME LETTERS
	public void getPatientName() {
		String strPatientName = "Shivalingappa";
		
		StringBuffer strName = new StringBuffer("Shivalingappa");
		strName.equals("Shivalingappa");
		strName.insert(0,"Shree");
		System.out.println(strName);
	}
	
	
//Builder:-It is also same method as Buffer but it is not thread safe.
	
	public void getHospitalName() {
		String strHospitalName = "Bharati";
		
		StringBuilder strName = new StringBuilder("Bharati");
		//strName.append(" Hospital");
		strName.replace(0, 2, "ph");
		System.out.println(strName);
	}

}
