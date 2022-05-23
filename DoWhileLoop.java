package com.vstl.javatraining;

public class DoWhileLoop {
	//3. do while loop
        //proper execution
	
	public void findStudentUsingDoWhileLoop() {
		String strArray[] = {"Sita","Sarita","Tanvi","Shruti","Rani","Ritu"};
		
		int intCounter=2;
		do {
			if(strArray[intCounter].equals("Tanvi")){
				System.out.println("Tanvi is present");
					break;	
			}
			intCounter++;
		}
			while(strArray.length<intCounter);
	}
	
	  
	// using Each loop
	public void findStudentUsingEachLoop() {
		String strArray[] = {"Sita","Sarita","Tanvi","Shruti","Rani","Ritu"};
		
		for (String string : strArray) {
			
			if(string.equals("Ritu")) {
				System.out.println("Ritu is present");
				break;
			}
		}
	}
	
		
		//Example
	public void doctorsInTheBelgaumCity() {
		int intDoctors = 1;
		do {
			System.out.println("Dispaly the total number to doctors:" +intDoctors);
			intDoctors++;
			}
		
	          while(intDoctors<=15) ;
            }

        //it is having the the error but it will get execute at least one time
     public void hospitalNamesInBelgaum() {

         int intNum = 8;
          do {
               System.out.println("The totall number of the hospital:"+intNum);
               intNum++;
             }
         while(intNum>15);
            }
    
}