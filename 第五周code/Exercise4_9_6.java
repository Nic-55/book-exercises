import java.util.Scanner;
public class Exercise4_9_6 {
	public static void main(String[]args) {
	/*用for循环写一个乘以6的乘法结果表
	for (int i = 1; i <= 12; i++) {
		int result = i * 6;
		System.out.println(i + " x 6 = " + result);
	}
	System.out.println(); */
		
		/*在以上基础上,把乘以6变为乘以用户输入的数值
		System.out.println("***Multiplication table***");
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = keyboard.nextInt();
		
		for (int i = 1; i <= 12; i++) {
			int result = i * num;
			System.out.println(i + " x " + num +" = " + result);
		} */
		
		//在此基础上,要求输入的数值不能小于2,否则报error message并要求重试
		System.out.println("***Multiplication table***");
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = keyboard.nextInt();
		
		for (int i = 1; i <= 12; i++) {
			int result = i * num;
			while (num < 2) {
				System.out.println("Number entered must be no less than 2.");
				System.out.println("Please try again:");
				num = keyboard.nextInt();
			}
			System.out.println(i + " x " + num +" = " + result);
			
		}
		
	}
}

			
	

