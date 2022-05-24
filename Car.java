package com.vstl.oopsConcept;

public class Car {

	// 3. Hierarchical:- It is having one super class and multiple sub classes.
	// or When two or more classes inherits a single class.
	
	public int intCarWheel = 4;
	public String strCarStart = "Start";
	public String strCarStop = "Stop";
	public String strCarRefuel = "Refuel";
	public String strCarTheftSafety = "TheftSafety";

	public void getAllCarDetails() {
		
	 BMWCar objBMWCar = new BMWCar();
	 objBMWCar.getBmwCarFeature();
	 
	 MahindraCar objMahindraCar = new MahindraCar();
	 objMahindraCar.getMahindraCarFeature();
	 
	}
	
} 


