import java.util.Scanner;
public class Exercise4_9_2 {
	
	public static void main(String[]args) {
		/*只显示一定范围内的偶数
		System.out.println("***Display all even numbers within given range***");
	
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = keyboard.nextInt();
		
		for (int i = 1; i <= num; i++) { //确定范围,1到输入值
			if (i % 2 == 0) { //确定是偶数
				System.out.println(i);
			}
		} */
		
		//用户输入一个数值,显示从1到这个数值里哪些是奇数哪些是偶数
		System.out.println("***Identify odds & evens***");
		
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number:");
		num = keyboard.nextInt();
		
		for (int i =1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			}
			else {
				System.out.println(i + " is odd");
			}
		}
		
	}
	

}
