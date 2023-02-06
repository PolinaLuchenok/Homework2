package by.hw2;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorParameterizedTest {
	
	Calculator calculator = new Calculator ();
	
	public static List<Object[]> dataForTest() {
		List<Object[]> results = new ArrayList<>();
		
		results.add(new Object[] {0, 59, '*', 0});
		results.add(new Object[] {10, 2, '*', 20});
		results.add(new Object[] {14.5, 10.1, '*', 146.45});
		results.add(new Object[] {100, 34.6789, '*', 3467.89});
		results.add(new Object[] {45, 20, '*', 900});
		results.add(new Object[] {-4, -3, '*', 12});
		results.add(new Object[] {-10, 45, '*', -450});
		results.add(new Object[] {34, 2, '+', 36});
		results.add(new Object[] {23.5, 1.39, '+', 24.89});
		results.add(new Object[] {5.005, 70, '+', 75.005});
		results.add(new Object[] {5, 6, '+', 11});
		results.add(new Object[] {-1.25, -11, '+', -12.25});
		results.add(new Object[] {-15, 4, '+', -11});
		results.add(new Object[] {30, 0, '+', 30});
		results.add(new Object[] {100, 50, '-', 50});
		results.add(new Object[] {11.11, 1.1, '-', 10.01});
		results.add(new Object[] {2, 0.0003, '-', 1.9997});
		results.add(new Object[] {5, 1, '-', 4});
		results.add(new Object[] {-10, -2, '-', -8});
		results.add(new Object[] {-10, 3, '-', -13});
		results.add(new Object[] {3, 0, '-', 3});
		results.add(new Object[] {10, 2, '/', 5});
		results.add(new Object[] {2.66, 1.1, '/', 2.418181818181818});
		results.add(new Object[] {0.5, 0.25, '/', 2});
		results.add(new Object[] {22, 11, '/', 2});
		results.add(new Object[] {-4, -4, '/', 1});
		results.add(new Object[] {-10, 2.5, '/', -4});
		
		return results;
	}
	
	@ParameterizedTest
	@MethodSource("dataForTest")
	public void testWithParams(double valueA, double valueB, char operation, double expected) throws Exception {
		Assertions.assertEquals(expected, calculator.calculate(valueA, valueB, operation));
	}
}
