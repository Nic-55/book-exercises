import java.util.Scanner;
public class Exercise3_9_3 {
	public static void main (String[]args) {
		
		//ask user to type in 2 numbers and guess at the sum.
		//show a message for correct answer and a message for wrong answer
		
		double num1;
		double num2;
		double answer;
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter a number:");
		num1 = keyboard.nextDouble();
		
		System.out.println("Enter another number:");
		num2 = keyboard.nextDouble();
		
		System.out.println("The sum of these two numbers is?");
		answer = keyboard.nextDouble();
		
		if (answer == (num1 + num2)) {
			System.out.println("Congrats! You're correct!");
		}
		else {
			System.out.println("Oops-_-1... The answer is " + (num1 + num2));
		}
		
	}

}
