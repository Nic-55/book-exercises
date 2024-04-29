import java.util.Scanner;
public class Exercise_3_9_9 {

	public static void main(String[] args) {
		// 一个银行有四种账户类型,提供不同的储蓄年利率
		// 让用户输入要存款的数目,显示不同账户给出的不同年利息
		// 每个账户都有不同的最低存款额
		
		char accountType;
		double amount;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter deposit amount in$:");
		amount = keyboard.nextDouble();
		System.out.println("Which type of account are you considering?");
		System.out.println("\tA,B,C or X.");
		accountType = keyboard.next().charAt(0);
		
		switch (accountType) {
		case 'A' | 'a': 
			if (amount >= 250)
			System.out.println("Your expected annual interest:$" + amount * (1.5 / 100));
			else 
				System.out.println("Error: A minimum of $250 is required for type A account.");
			break;
		case 'B' | 'b' : 
			if (amount >= 1000)
				System.out.println("Your expected annual interest:$" + amount * (2.0 / 100));
				else 
					System.out.println("Error: A minimum of $1000 is required for type B account.");
			break;
		case 'C' | 'c' : 
			if (amount >= 250)
				System.out.println("Your expected annual interest:$" + amount * (1.5 / 100));
				else 
					System.out.println("Error: A minimum of $250 is required for type C account.");
			break;
		case 'X' | 'x' : 
			if (amount >= 5000)
				System.out.println("Your expected annual interest:$" + amount * (5.0 / 100));
				else 
					System.out.println("Error: A minimum of $5000 is required for type X account.");
			break;
		default : 
			System.out.println("No such type.");
			
		}
		}
}
	