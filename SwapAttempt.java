//user提供x值和y值,互换值

import java.util.Scanner;
public class SwapAttempt{
	
public static void main(String[]args)
{
Scanner keyboard = new Scanner(System.in);

int x,y;

System.out.println("Enter value for x:");
x = keyboard.nextInt();

System.out.println("Enter value for y:");
y = keyboard.nextInt();

int temp = x;
x = y;
y = temp;

System.out.println("x = " + x);
System.out.println("y = " + y);

}

}