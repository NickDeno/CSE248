package p1_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import p1.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		double actualValue = c.add(10.0,5.0);
		double expectedValue = 15.0;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testSubtract() {
		Calculator c = new Calculator();
		double actualValue = c.subtract(10.0,5.0);
		double expectedValue = 5.0;
		assertEquals(expectedValue, actualValue);
	}
}
