import java.util.Scanner;
public class Exercise3_9_7_a {

	public static void main(String[] args) {
		// 使输入的信息不区分大小写
		
		char group;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("***Lab Times***");
		System.out.println("Enter your group (A,B,C):");
		group = keyboard.next().charAt(0);
		
		if (group == 'A' | group == 'a') {
			System.out.println("10.00 a.m");
		}
		else if (group == 'B' | group == 'b') {
			System.out.println("1.00 p.m");
		}
		else if (group == 'C' | group == 'c') {
			System.out.println("11.00 a.m");
		}
		else {
			System.out.println("No such group.");
		}
		

	}

}