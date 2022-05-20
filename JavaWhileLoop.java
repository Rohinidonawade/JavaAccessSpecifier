package com.vstl.javatraining;

public class JavaWhileLoop {

	     //2.while loop
                  //proper execution. 
        public void rainingInTheCities() {

        String strRainingCities[] = {"Belgaum","Kolhapur","Miraj","Chikkodi","Senkeshwar","Sangli","Dharwad","Pune"};
          int intCounter = 0;

          while(strRainingCities.length>intCounter) {
            System.out.println("Array RainingCities:"+strRainingCities[intCounter]);

         if(strRainingCities[intCounter].equals("Dharwad")) {
            System.out.println("Dispay the Dharwad");
        break;
             }
              intCounter++; 
       }
    }
   

                 //Without giving the intCounter++ it will execute infinitely.
        public void rainingInTheCitiesInKarnatakaState() {

        String strRainingCities[] = {"Belgaum","Chikkodi","Senkeshwar","Dharwad","Gadag","Hukkeri"};
          int intCounter = 0;

          while(true) {
             System.out.println("Array RainingCities:"+strRainingCities[intCounter]);

          if(strRainingCities[intCounter].equals("Dharwad")) {//(Dharwadg)it will give an exception "java.lang.ArrayIndexOutOfBoundsException"
             System.out.println("Dispay the Dharwad");
               break;
               }     
       }
   }
}
        
        
  



