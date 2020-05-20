package com.main;

import java.util.Scanner;

public class LeapYearCheck {

	
	public static void main(String[] args) {
		int year;
	    System.out.println("Enter an Year :: ");
	    Scanner sc = new Scanner(System.in);
	    year = sc.nextInt();
	    System.out.println("Entered Year is "+year);
	    LeapYearFunctions leapYearFunctions =new LeapYearFunctions();
	    String Result=leapYearFunctions.checkLeapYear(year);
	    System.out.println(Result);
	}
}
