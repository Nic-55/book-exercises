import java.util.Scanner;
public class Exercise3_9_8 {

	public static void main(String[] args) {
		// 一个银行有四种账户类型,提供不同的储蓄年利率
		// 让用户输入要存款的数目,显示不同账户给出的不同年利息
		
		char accountType;
		double amount;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter deposit amount in$:");
		amount = keyboard.nextDouble();
		System.out.println("Which type of account are you considering?");
		System.out.println("\tA,B,C or X.");
		accountType = keyboard.next().charAt(0);
		
		switch (accountType) {
		case 'A' | 'a' : 
			System.out.println("Your expected annual interest:$" + amount * (1.5 / 100));
			break;
		case 'B' | 'b' : 
			System.out.println("Your expected annual interest:$" + amount * (2.0 / 100));
			break;
		case 'C' | 'c' : 
			System.out.println("Your expected annual interest:$" + amount * (1.5 / 100));
			break;
		case 'X' | 'x' : 
			System.out.println("Your expected annual interest:$" + amount * (5.0 / 100));
			break;
		default : 
			System.out.println("No such type.");
			
		}
		}
}
	