import java.util.Scanner;
public class Exercise4_9_7 {
	public static void main(String[] args) {
		
		int num; //to hold user response
		
		Scanner keyboard = new Scanner(System.in);
		//prompt and get user response
		
		System.out.println("Size of square?");
		num = keyboard.nextInt();
		//display the square
		
		if(num >= 2 && num <= 20) {
		for (int i = 1; i <= num; i++) {  //number of rows for num
			
			for(int j = 1; j <= num; j++) {  //number of *s in a row
				
				System.out.print("*");
			} 
			System.out.println(); 
		}
		}
		}
	}
