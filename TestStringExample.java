package com.vstl.stringEx;

public class TestStringExample {

	public static void main(String[] args) {
		
		StringExample objStringExample = new StringExample();
		String strNameWithMarks =objStringExample.getStudentNameWithMarks("Rohini","80");
		System.out.println("The Name With Marks:" +strNameWithMarks);
		
		               System.out.println("******************");
		
		String strName =objStringExample.getBelgaumCollageUnivercityName("Rani Chennamma Univercity");
		System.out.println("The Univercity Name :" +strName);
		System.out.println("The Univercity Name :" +strName.length());
		
	                   System.out.println("******************");
		
		String strUnivercity = objStringExample.verifyChannammaInUnivercityName("Univercity");
		System.out.println("Get Univercity:" +strUnivercity);
		
	                   System.out.println("******************");

		System.out.println("Get Univercity:" +strUnivercity.toLowerCase());
		System.out.println("Get Univercity:" +strUnivercity.toUpperCase());
		
	                   System.out.println("******************");          
	           
	    String strHospitalName = objStringExample.getHospitalName(" ");
	     
                       System.out.println("******************");
               
        String strWord = objStringExample.verifyHospitalInGetHospitalName("Hospital");
        System.out.println("The word is :" +strWord );        
        String getWord = objStringExample.verifyHospitalInGetHospitalName("Hospital");
        System.out.println("The word is :" +getWord.substring(3));   //pital
        System.out.println("The word is :" +getWord.substring(0));   //Hospital
         
                       System.out.println("******************");

        String strCompanyName = objStringExample.getAnItCompanyName("Square");
        System.out.println("The word is :" +strCompanyName );   
        String strSquareInCompanyName = objStringExample.getAnItCompanyName("Square");
        System.out.println("The word is :" +strSquareInCompanyName .substring(2, 5));   //uar "e" is the it is not included.

                        System.out.println("******************");
                        
        String strCityName = objStringExample.getSmartCityName("Pone");
		System.out.println("City Name is: " +strCityName.replace('o','u'));
		System.out.println("City Name is: " +strCityName.replace("Pone","Belgaum")); 
		
                        System.out.println("******************");

		String strCollageName = objStringExample.getSmartCityName("Shivanand");
		System.out.println("Collage Name is: " +strCollageName.startsWith("Shi"));
		System.out.println("Collage Name is: " +strCollageName.startsWith("Vhi"));
		
		System.out.println("Collage Name is: " +strCollageName.endsWith("Vhi"));
		System.out.println("Collage Name is: " +strCollageName.endsWith("nd"));
		
                        System.out.println("******************");
                        
        String strBankName = objStringExample.ruralBankName("KVGB Bank");
        System.out.println("Bank Name is: " +strBankName.charAt(2));
        System.out.println("Bank Name is: " +strBankName.charAt(4));
        
                        System.out.println("******************");
        
        String strBelgaumHospital = objStringExample.belgaumHospitalName("Civil");
        System.out.println("Hospital Name is: " +strBelgaumHospital.indexOf("vi"));  //2
        System.out.println("Hospital Name is: " +strBelgaumHospital.indexOf("i",3));  //3,i start at 1 but I have given 3 so it will start from the 3
        System.out.println("Hospital Name is: " +strBelgaumHospital.lastIndexOf("vi")); //2h
        //when I will mention the int so it will count from bigning and stop and count from last and print the index        
        System.out.println("Hospital Name is: " +strBelgaumHospital.lastIndexOf("vi",3)); 
        
                          System.out.println("******************");


        String strCollageNameInChikkodi = objStringExample.verifyTheCollageName("BK");
        System.out.println("Collage Name is: " +strCollageNameInChikkodi.equals("BK"));
        System.out.println("Collage Name is: " +strCollageNameInChikkodi.equals("bk"));

        System.out.println("Collage Name is: " +strCollageNameInChikkodi.equalsIgnoreCase("bk"));
        
                          System.out.println("++++++++++++++++++++++");
 
        String strCollageNameWithPricipleName = objStringExample.getCollageNameWithPricipleName("  ");
		System.out.println("Collage Name is \" Priciple Name");
		System.out.println("Collage Name is \\ Priciple Name");
		System.out.println("Collage Name is \n Priciple Name");
		System.out.println("Collage Name is\t Priciple Name");
	}
}
