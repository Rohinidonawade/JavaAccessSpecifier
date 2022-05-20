package com.vstl.javatraining;

public class JavaForLoop {

	// 1.for loop
               //executed properly
         public void trainingEmployeeNameList() {

           String strEmployeeNames[] = {"Rohini","Priyanka","Chaitali","Aditi","Ekta","Shivani","Swapnil"};

           for(int intIndex =0; intIndex < strEmployeeNames.length; intIndex++) {
              System.out.println("Array employee Names:" +strEmployeeNames[intIndex]);

          if(strEmployeeNames[intIndex].equals("Aditi")) {
	           System.out.println("Array Employee Name:" +strEmployeeNames[intIndex]);
         }
     }
 }
               // Without giving increment[+] then it will execute infinitely.
          public void trainingEmployeeList() {

            String strEmployeeNames[] = {"Rohini","Priyanka","Chaitali","Aditi","Ekta","Shivani","Swapnil"};

     for(int intIndex =0;intIndex < 6;) { //size[9]:-"java.lang.ArrayIndexOutOfBoundsException" it will give an exception
	           System.out.println("Array employee Names:" +strEmployeeNames[intIndex]);
	
	           if(strEmployeeNames[intIndex].equals("Rohini")) {
          }
       }
 }
}
