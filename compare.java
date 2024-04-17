
import java.util.Scanner; //ask for numbers and compare
public class compare {
	public static void main(String[]args) {
		int n1;
		int n2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter first number: ");
		n1 = keyboard.nextInt();
		System.out.print("Enter second number: ");
		n2 = keyboard.nextInt();
		if (n1 == n2)
		{
			System.out.println("Numbers are equal.");
		}
		else if (n1 > n2)
		{
			System.out.println("First number is bigger.");
		}
		else if (n1 < n2)
		{
			System.out.println("Second number is bigger.");
		}
		
	}
	

}