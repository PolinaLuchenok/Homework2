package by.hw2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {
	private Calculator calculator;
	
	@BeforeEach
	public void createObj() {
		calculator = new Calculator ();
	}
	
	@Test
	public void testGettingNumber() {
		Assertions.assertEquals(4, calculator.getNumber("4"));
	}
	
	@Test
	public void testGettingNotNumberWithException() {
		Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
	    	calculator.getNumber("ytuyu");
	    });

	    String expectedMessage = "For input string";
	    String actualMessage = exception.getMessage();

	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void testGettingNumberEmptyStringWithException() {
		Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
	    	calculator.getNumber("");
	    });

	    String expectedMessage = "empty String";
	    String actualMessage = exception.getMessage();

	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void testGettingOperation() {
		Assertions.assertEquals('/', calculator.getOperation("/798_+"));
	}
	
	@Test
	public void testGettingOperationEmptyStringWithException() {
	    Exception exception = Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> {
	    	calculator.getOperation("");
	    });

	    String expectedMessage = "String index out of range: 0";
	    String actualMessage = exception.getMessage();

	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void testCalculatingResult() throws Exception {
		Assertions.assertEquals(-1, calculator.calculate(-1.5, -0.5, '-'));
	}
	
	@Test
	public void testDivisionByZero() {
		Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
			calculator.calculate(1.5, 0, '/');
	    });

	    String expectedMessage = "Division by zero";
	    String actualMessage = exception.getMessage();

	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	public void testCalculatingResultWithInvalidOperation() throws Exception {
		Exception exception = Assertions.assertThrows(DefaultOperationException.class, () -> {
			calculator.calculate(-20, -10, '?');
	    });

	    String expectedMessage = "Invalid operation";
	    String actualMessage = exception.getMessage();

	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	}
}
