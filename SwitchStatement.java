package com.vstl.javatraining;

public class SwitchStatement {
	
	int intday = 1;
	
	public void daysInAWeek() {
		 
		switch(intday) {
		
		case 1:
			System.out.println("1st day is Sunday");
			break;
			
		case 2:
			System.out.println("2nd day is Monday");
			break;
			
		case 3:
			System.out.println("3rd day is Tuesday");
		    break;
		    
		case 4:
			System.out.println("4th day is Wednesday");
			break;
			
		case 5:
			System.out.println("5th day is Thursday");
			break;
			
		case 6:
			System.out.println("6th day is Friday");
			break;
			
		case 7:
			System.out.println("7th day is Saturday");
			break;
			
		}
	}

}
