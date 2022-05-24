package com.vstl.oopsConcept;

public class BMWCar extends Car{
	
	public String strCarStart = "Start";
	public String strCarStop = "Stop";
	
	public void getCarStart() {
		
		System.out.println("Car will get Start :" +strCarStart);
				
	}

     public void getCarStop() {
		
		System.out.println("Car will get Start :" +strCarStop);
		
    }
     
     public void getBmwCarFeature() {
    	 this.getCarStart();
    	 this.getCarStop();
     }
}

