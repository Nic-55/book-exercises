import java.util.Scanner;
public class Exercise3_9_7_b {

	public static void main(String[] args) {
		// 使输入的信息不区分大小写
		
		char group;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("***Lab Times***");
		System.out.println("Enter your group (A,B,C):");
		group = keyboard.next().charAt(0);
		
		switch (group) {
		case 'A' | 'a' : 
			System.out.println("10.00 a.m");
			break;
		case 'B' | 'b' : 
			System.out.println("1.00 p.m");
			break;
		case 'C' | 'c' : 
			System.out.println("11.00 a.m");
			break;
		default : 
			System.out.println("No such group.");
			
		}
		}
}
		

		
	