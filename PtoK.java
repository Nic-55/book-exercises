import java.util.Scanner;
public class PtoK{
	
public static void main(String[]args)
{
Scanner keyboard = new Scanner(System.in);
double pound,kilo;
System.out.println("Enter weight in pounds:");
pound = keyboard.nextDouble();
kilo = pound / 2.2;
System.out.println(kilo + " kilos");

}

}