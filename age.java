//Age is an integer number, we all have an age and it is increasing every year, ain't it? We're all getting older. 
//So, this code will ask about the user's age and there is a switch case applied to this Java code.
//Source: ResearchGate (I found it on Google, correct me if I'm wrong).

import java.util.Scanner;

public class age{
	public static void main(String[] args){

		//As usual, variables declaration:
		int age; 
		String category_a = "baby", category_b = "young adults", category_c = "middle-aged adults", category_d = "old adults", error = "Something is wrong, please try again.";

		//Input scanner
		Scanner a = new Scanner(System.in);


		//Now, program starts: 
		System.out.println("Dear human, please enter your age: ");
		age = a.nextInt();

		//If-else statements: 
		if(age >= 0 && age <= 2)
		{
			System.out.println("Your age is " + age);
			System.out.println("So, you're in "+ category_a + " category");
			System.out.println("How cute! :)");
		}
		else if(age >= 3 && age <= 39)
		{
			System.out.println("Your age is " + age);
			System.out.println("So, you're in "+ category_b + " category");
		}
		else if(age >= 40 && age <= 59)
		{
			System.out.println("Your age is " + age);
			System.out.println("So, you're in "+ category_c + " category");
		}
		else if(age >= 60)
		{
			System.out.println("Your age is " + age);
			System.out.println("So, you're in "+ category_d + " category");
		}
		else
		{
			System.out.println(error);
		}

		switch(age){
			case (0):
				System.out.println("\nYou're an infant.");
				break;

			case (1):
				System.out.println("\nYou're an infant.");
				break;

			case (18):
				System.out.println("\nKeep your head up! There is more upcoming challenges out there, be prepared.");
		}
	}
}

//If there is some mistakes or a correction, please tell me.  
