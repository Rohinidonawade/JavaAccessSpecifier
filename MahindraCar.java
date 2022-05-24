package com.vstl.oopsConcept;

public class MahindraCar extends Car{
	
	public int intCarWheel = 4;
	public String strCarRefuel = "Refuel";
	public String strCarTheftSafety = "TheftSafety";
 
	 public void getCarWheelCount() {
		 
		 System.out.println("Car wheel is : " +intCarWheel);
	 }
	 
	 public void getCarRefuel() {
		 
		 System.out.println("Car Refuel : " +strCarRefuel);
	 }
     
	 public void getCarTheftSafety() {
		 
		 System.out.println("Car TheftSafety : " +strCarTheftSafety);
	 }
	 
	 public void getMahindraCarFeature() {
    	 this.getCarWheelCount();
    	 this.getCarRefuel();
    	 this.getCarTheftSafety();
     }
}
