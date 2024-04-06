//输入user身高体重,计算并输出BMI

import java.util.Scanner;
public class BMI{
	
public static void main(String[]args)
{
Scanner keyboard = new Scanner(System.in);
int weight;
double height,bmi;
System.out.println("Please enter your weight in kg:");
weight = keyboard.nextInt();
System.out.println("Please enter your height in meters:");
height = keyboard.nextDouble();

bmi = weight / (height * height);
;
System.out.println("Your BMI is: " + bmi);

}

}