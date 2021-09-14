// JAVA MOST POPULAT TESTING FRAMEWORK
// 1. JUnit -> is an open source Unit Testing Framework for Test-Driven Development Environment (TDD). TIt's opposed the core concept of first testing then coding, the data is first tested and then it is inserted in the piece of code, it provides the simplest approach for lighting code swiftly and easily. It also offers annotation for test identification.
// 2. Test NG -> 

// MATH CLASS -> MAIN CLASS

public final class Math{

	public static int add(int first, int second){
		return first + second;
	}

	public static int multiply(int multiplicand, int multiplier){	// 5 x 4 = 20; 	5 -> multiplicand, 4 -> multiplier, 20 -> product
		return multiplicand * multiplier;
	}
}

// MATH TESTS CLASS

import org.testng.annotations.Test

import static org.testng.Assert.assertEquals;  // Assert Equals -> method

public class MathTests{

	@Test // Annotations Test
	public void add_TwoPlusTwo_ReturnsFour(){ 	// This Function is a single UNIT. We can keep adding as many unit as we want
		final int expected = 4;
		
		final actual = Math.add(2, 2);

		assertEquals(actual, expected);
	}

	@Test
	public void multiply_TwoNumbers_ReturnsValue(){
		final int expected = 4;
		final int actual = Math.multiply(2, 2);

		assertEquals(actual, expected);
	}

	@Test // Annotations Test
	public void divide_TenDivideByFive_ReturnsTwo(){
		final double expected = 2.0;
		final actual = Math.divide(10, 5);

		assertEquals(actual, expected);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void divide_TenDivideByZero_ThrowsIllegalArgumentException(){
		Math.divide(10, 0)
	}
}