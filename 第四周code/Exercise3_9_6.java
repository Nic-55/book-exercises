import java.util.Scanner;
public class Exercise3_9_6 {
	//卖电脑办公器材
	//根据不同add-on显示不同价格
		
	public static void main(String[]args)
	{
	Scanner keyboard = new Scanner(System.in);
	double price;
	double baseCost = 375.99;
	int screen;
	double screen38 = 75.99;
	double screen43 = 99.99;
	int option;
	double antiSW = 65.99;
	double printer = 125.00;

	
	System.out.println("Select a screen size: (1)38cm or (2)43cm.");
	screen = keyboard.nextInt();
	if (screen == 1) {
		System.out.println("Your base cost is: $" + (baseCost + screen38));
		System.out.println("Would you like to add on these options?");
		System.out.println("(1)Antivirus software \n(2)Printer \n(3)Both \n(4)None");
		option = keyboard.nextInt();
		if (option == 3) {
			System.out.println("Your final cost is:$" + (baseCost + screen38 + antiSW + printer));
		}
		if (option == 1) {
			System.out.println("Your final cost is:$" + (baseCost + screen38 + antiSW));
		}
		if (option == 2) {
			System.out.println("Your final cost is:$" + (baseCost + screen38 + printer));
		}
		if (option == 4) {
			System.out.println("Your final cost is still:$" + (baseCost + screen38));
		}
		
	}
	
	else {
		System.out.println("Your base cost is: $" + (baseCost + screen43));
		System.out.println("Would you like to add on these options?");
		System.out.println("(1)Antivirus software \n(2)Printer \n(3)Both \n(4)None");
		option = keyboard.nextInt();
		if (option == 3) {
			System.out.println("Your final cost is:$" + (baseCost + screen43 + antiSW + printer));
		}
		if (option == 1) {
			System.out.println("Your final cost is:$" + (baseCost + screen43 + antiSW));
		}
		if (option == 2) {
			System.out.println("Your final cost is:$" + (baseCost + screen43 + printer));
		if (option == 4) {
				System.out.println("Your final cost is still:$" + (baseCost + screen43));
			}
		}
		
	}
		
	}	
			}

