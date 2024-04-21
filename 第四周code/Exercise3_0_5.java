import java.util.Scanner;
public class Exercise3_0_5 {
	//输入user身高体重,计算并输出BMI
	//显示不同区间体重状态
		
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
	
	if( bmi < 18.5) {
	System.out.println("Your BMI is: " + bmi + "\nUnderweight.");
	}
	else {
		if(bmi > 24.9) {
			System.out.println("Your BMI is: " + bmi + "\nOverweight.");
		}
		else {
			System.out.println("Your BMI is: " + bmi + "\nHealthy.");
		}
			}
	}

	}
