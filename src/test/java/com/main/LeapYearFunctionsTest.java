package com.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class LeapYearFunctionsTest {

	private LeapYearFunctions leapYearsFunctions;
	
	@BeforeEach
	void initBefore() {
//		fail("Not yet implemented");
		leapYearsFunctions = new LeapYearFunctions();
	}
	
	@Nested
	@DisplayName("TestCheckLeapYearMethod")
	class testcheckLeapYear {

		@Test
		@DisplayName("Testing Input is positive and greater then 0")
		void testPositiveNumber() {
			assertEquals("Input should be Positive or greater then 0.", leapYearsFunctions.checkLeapYear(-1234),"Input should be Positive Number.");
		}
		
		@Test
		@DisplayName("Testing Input Year is a Leap Year")
		void testLeapYear() {
			int year=2000;
			assertEquals(year+" is a Leap Year", leapYearsFunctions.checkLeapYear(year));
		}
		
		@Test
		@DisplayName("Testing Input Year is Not a Leap Year")
		void testNotLeapYear() {
			int year=2000;
			assertEquals(year+" is not a Leap Year", leapYearsFunctions.checkLeapYear(year));
		}
	}

}
