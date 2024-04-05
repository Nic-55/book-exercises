import java.util.Scanner;
public class FindCost3{
	
public static void main(String[]args)
{
Scanner keyboard = new Scanner(System.in);
double price,tax;
System.out.println("***Product Price Check***");
System.out.println("Enter initial price:");
price = keyboard.nextDouble();
System.out.println("Enter tax rate:");
tax = keyboard.nextDouble();
price = price*(1+tax/100);
keyboard.close(); //not sure what it does,added because of warning on line4
System.out.println("Cost after tax="+price);

}

}
