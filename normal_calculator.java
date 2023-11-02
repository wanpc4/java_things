//This code is created to apply the mathematical concept in Java. 

import java.util.Scanner;

public class normal_calculator{

	public static void main(String[] args)
	{

		//First, declaration of variables: 
		int operation;
		double num1, num2, total_1, total_2, total_3, total_4;

		//Next, scanner input. To allow user enter the number.
		Scanner number1 = new Scanner(System.in);
		Scanner number2 = new Scanner(System.in);
		Scanner ops = new Scanner(System.in);

		//Now, program starts: 
		System.out.println("---Java Calculator---");

		//First number:
		System.out.println("Enter first number: ");
		num1 = number1.nextDouble();

		//Choose operation to execute: 
		System.out.println("Choose operation to perform:");
		System.out.println("1) +");
		System.out.println("2) -");
		System.out.println("3) x");
		System.out.println("4) ÷");
		operation = ops.nextInt();

		//Second number: 
		System.out.println("Enter second number: ");
		num2 = number2.nextDouble();


		//if-else statement:
		if(operation == 1){

			total_1 = num1 + num2;
			System.out.println("Answer: " + total_1);

		} else if(operation == 2){

			total_2 = num1 - num2;
			System.out.println("Answer: " + total_2);

		} else if(operation == 3){

			total_3 = num1 * num2;
			System.out.println("Answer: " + total_3);

		} else if(operation == 4){

			total_4 = num1 / num2;
			System.out.println("Answer: " + total_4);

		} else {

			System.out.println("Something's wrong, please try again.");

			}
	}

}
