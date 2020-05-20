package com.main;

public class LeapYearFunctions {
	
	public String checkLeapYear(int year) {
		if(year<1) {
			return "Input should be Positive or greater then 0.";
		}
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	        return year+" is a Leap Year"; 
	      else
			 return year+" is not a Leap Year";
	}

}
