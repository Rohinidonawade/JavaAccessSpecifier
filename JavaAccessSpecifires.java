package com.accessModifires;

public class JavaAccessSpecifires {
	
	//1.public  2.private   3.protected    4.default
	
	//1.public:- we can access with in class and out the class of same package and different package also.
	
	public void collageName() {
		String strCollageName = "Shivanand Collage";
		
		System.out.println("Dispaly the CollageName: " +strCollageName);
	}
	
	//2. private:-With in the class only we can access.
	
	private void numberOfStudentsInShivandCollage() {
		int intNumberOfStudents = 500;
		System.out.println("The total number of Students in Shivanad Collage :" +intNumberOfStudents);
	}
	
	//3. protected:- We can access within the class and same package but not out side the package.
	
	protected void totalNumberOfGirlsInShivanandCollage() {
		int intNumberOfGirls = 298;
		System.out.println("The total number of Girls in Shivanad Collage :" +intNumberOfGirls);
	}
	
	// 4. default:-Without giving specifier java will run by default within the class and out side with a same package.
	
	void totalNumberOfBoysInShivanandCollage() {
		int intNumberOfBoys = 202;
		System.out.println("The total number of Boys in Shivanad Collage :" +intNumberOfBoys);
	}
	
}
