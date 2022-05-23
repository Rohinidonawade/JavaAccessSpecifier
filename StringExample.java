package com.vstl.stringEx;

public class StringExample {
	
	      //1. CONCATE:- To add two strings.
	public static String getStudentNameWithMarks(String strName,String intMarks) {
		
		String strNameWithMarks = strName.concat(intMarks);
	
		return strNameWithMarks;
		
	}
	     
         //2. LENGTH
	public String getBelgaumCollageUnivercityName(String strName) {
		return strName;
		
	}
	  
	     // 3. SPLIT:- used to find out one word in the sentence.
	     //4.UPPERCASE AND LOWECASE.
	public String verifyChannammaInUnivercityName(String strName) {
		
		String strArray[] = strName.split(" ");
		String strReturnValue = " ";
		for (String string: strArray) {
			if(string.equals("Univercity")) {
				strReturnValue = string;
				break;				
			}
		}
		return strReturnValue;
	}
	
	     //5. TRIM :-is used to remove the spaces.
	public String getHospitalName(String strName) {
		String strHospitalName = "     KLE Hospital   ";
		System.out.println("Hospital Name : " +strHospitalName);
		
		String strHospitalProperNaming = strHospitalName.trim();
		System.out.println("Name is : " +strHospitalProperNaming);
		
		return strName;
		
	}
	
	    //6. SUBSTRING :- Returns a substring from start to end substring(2) returns remaining.
	
	public String verifyHospitalInGetHospitalName(String strHospitalName) {
		String strWord = "KLE Hospital";
		if(strHospitalName.equals("Hospital")) {			
		}
		
	    String getWord = "Hospital";		
		return strHospitalName;		
	}
	
	  //7. SUBSTRING(STRAT ,END):- Returns a substring from start to end index start included and end excluded.
	 
	public String getAnItCompanyName(String strName) {
		String strCompanyName = "Verve Square Technology";
		if(strCompanyName.equals("Square")) {			
		}
		String strSquareInCompanyName = "Verve Square Technology";
		return strName;
	}
	
	  //8. REPLACE :- It will help to replace the character and string.
	
	public String getSmartCityName(String strName) {
		String strCityName = "Pone";
		
		System.out.println("City Name is: " +strCityName);
		return strName;		
	}
	
	   //9. STARTWITH :- Returns true if name "Starts" with correct letter else false.
	   //10. ENDTWITH :- Returns true if name "EndS" with correct letter else false.

	public String collageName(String strName) {
		String strCollageName = "Shivanand";
		
		System.out.println("City Name is: " +strCollageName);
		return strName;	
	}
	
	  // 11. CHARAT:- Returns character of a index position in this case.
	 
	public String ruralBankName(String strName) {
		String strBankName = "KVGB Bank";
		
		System.out.println("City Name is: " +strBankName);
		return strName;	
	}
	
	 //12. INDEXOF:-(start from the end) Returns the index of the string of the 1st letter.
	 //13. INDEXOF("String",integer):-Start with the integer value and gives the remaining word.
	// 14. LASTINDEXOF:-It will start from the end.
	
	public String belgaumHospitalName(String strName) {
		String strBelgaumHosital = "Civil";
		
		System.out.println("City Name is: " +strBelgaumHosital);
		return strName;	
	}
	
	  //15. EQUALLS :- Return true if string is equals.
	  //16. EQUALSSIGNORECASE:- It will ignore that lower or upper case.
	
	public String verifyTheCollageName(String strName) {
		String strCollageNameInChikkodi = "BK";
		System.out.println("Collage Name is: " +strCollageNameInChikkodi);
		return strName;	
	}
	
	
	//ESCAPE SEQUENCE CHARECTERS:- \n(new line), \t(tab), \'(single quote), \\(back slash).
	
	public String getCollageNameWithPricipleName(String strName) {
		String strCollageName = "Shivanand";
		String strPrincipleName = "Karallatti";
		String strCollageNameWithPricipleName = "strCollageName".concat(strPrincipleName);
		
		return strName;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
