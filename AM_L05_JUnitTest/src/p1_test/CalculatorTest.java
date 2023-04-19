package p1_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import p1.Calculator;

public class CalculatorTest {
	static Calculator c;

	//BeforeAll annotation garuntees this method will run first before the test methods. Must be static method
	@BeforeAll
	public static void setup(){
		c = new Calculator();
	}

	//AfterAll annotation garuntees this method will run after the test methods. Must be static method
	@AfterAll
	public static void teardown(){
		System.out.println("This is the end");
	}

	@Test
	public void testAdd() {
		// Calculator c = new Calculator();
		double actualValue = c.add(10.0,5.0);
		double expectedValue = 15.0;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testSubtract() {
		// Calculator c = new Calculator();
		double actualValue = c.subtract(10.0,5.0);
		double expectedValue = 5.0;
		assertEquals(expectedValue, actualValue);
	}
}
