package by.hw2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculatorTest.class, CalculatorParameterizedTest.class})
public class SuiteTest {

}
