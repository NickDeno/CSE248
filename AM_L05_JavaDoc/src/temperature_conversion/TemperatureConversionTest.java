package temperature_conversion;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TemperatureConversionTest {
	
	@Test
	public void testCelsiusToFarenheit() {
		assertThrows(IllegalArgumentException.class, () -> {
			TemperatureConversion.celsiusToFarenheit(-274);
		});
		assertEquals(32.0, TemperatureConversion.celsiusToFarenheit(0.0), 0.0000001);
	}
}
