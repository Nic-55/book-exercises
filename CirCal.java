//输入一个圆的半径,计算出圆的面积和周长

import java.util.Scanner;
public class CirCal{
	
public static void main(String[]args)
{
Scanner keyboard = new Scanner(System.in);
double radius,area,cf,pi;

System.out.println("Radius:");
radius = keyboard.nextDouble();

pi = 3.1416;

area = pi * (radius * radius);
System.out.println("Area of the circle is " + area);

cf = 2 * pi * radius;
System.out.println("Circumference of the circle is " + cf);


}

}