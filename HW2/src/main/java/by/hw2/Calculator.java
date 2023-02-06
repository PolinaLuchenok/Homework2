package by.hw2;

public class Calculator {
	
	public Calculator() {
		super();
	}

	public double getNumber(String number) {
        return Double.parseDouble(number);
	}
	
	public char getOperation(String oper) {
        return oper.charAt(0);
	}

	public double calculate(double num1, double num2, char operation) throws Exception{
		double result;
		
		switch (operation){
        case '+':
            result = num1+num2;
            break;
        case '-':
            result = num1-num2;
            break;
        case '*':
            result = num1*num2;
            break;
        case '/':
        	if (num2 == 0) {
        		throw new ArithmeticException("Division by zero");
            } else {
            	result = num1 / num2;
            }
            break;
        default:
        	throw new DefaultOperationException("Invalid operation");
			}
		return result;
	}
}
