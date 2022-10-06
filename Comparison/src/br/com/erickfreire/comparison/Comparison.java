package br.com.erickfreire.comparison;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.println("Program that compares two values: ");
		System.out.print("Enter the first value: ");
		number1 = input.nextInt();
		
		System.out.print("Enter the second value: ");
		number2 = input.nextInt();
		
		if(number1 == number2)
			System.out.printf("The number %d == %d%n", number1, number2);
		
		if(number1 != number2)
			System.out.printf("The number %d != %d%n", number1, number2);
		
		if(number1 > number2)
			System.out.printf("The number %d > %d%n", number1, number2);
		
		if(number1 < number2)
			System.out.printf("The number %d < %d%n", number1, number2);
		
		if(number1 >= number2)
			System.out.printf("The number %d >= %d%n", number1, number2);
		
		if(number1 <= number2)
			System.out.printf("The number %d <= %d%n", number1, number2);
	}

}
