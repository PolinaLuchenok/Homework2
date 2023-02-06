package by.hw2;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		String number1;
		String number2;
		String oper;
		double num1;
		double num2;
		char operationChar;
		double result;
		
		do {
			System.out.println("Please enter the number!");
			number1 = scan.nextLine();
			try {
				num1 = calc.getNumber(number1);
			} catch (NumberFormatException e) {
				System.out.println("You didn't enter a number. Try again!");
				continue;
			}
			break;
		} while (true);
		
		do {
			System.out.println("Please enter the number!");
			number2 = scan.nextLine();
			try {
				num2 = calc.getNumber(number2);
			} catch (NumberFormatException e) {
				System.out.println("You didn't enter a number. Try again!");
				continue;
			}
			break;
		} while (true);
		
		
		do {
			System.out.println("Please enter the operation!");
			oper = scan.nextLine();
			try {
				operationChar = calc.getOperation(oper);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("You entered an empty string. Try again!");
				continue;
			}
			break;
		} while (true);
		
		try {
			result = calc.calculate(num1, num2, operationChar);
			System.out.println("Operation result = " + result);
		} catch (ArithmeticException exc) {
			System.out.println("You can't divide by zero!");
		} catch (DefaultOperationException e) {
			System.out.println("You entered an invalid operation!");
		}
		
		scan.close();
	}
}
