package com.vstl.javatraining;

public class DoWhileLoop {
	//3. while loop
        //proper execution
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