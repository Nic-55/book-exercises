import java.util.Scanner;
public class SomeProg{
	
public static void main(String[]args)
{
Scanner keyboard = new Scanner(System.in);
int age,year,bornIn;
System.out.println("How old are you this year?");
age = keyboard.nextInt();
year = 2024;
bornIn = year - age;
System.out.println("I think you were born in "+ bornIn);

}

}