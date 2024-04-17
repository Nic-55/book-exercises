import java.util.Scanner;
public class movieT { //age under 14 get half price discount
	public static void main(String[]args)
	{
		double price = 10.00;
		int age;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter your age:");
		age = keyboard.nextInt();
		if (age <14)
		{
			System.out.print("Ticket price = " + (price / 2) );
		}
		else
		{
			System.out.print("Ticket price = " + price );
		}
		
}

}
