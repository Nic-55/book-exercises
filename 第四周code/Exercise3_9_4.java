import java.util.Scanner;
public class Exercise3_9_4 {
	public static void main (String[]args) {
		//用户输入考试成绩,及格的输出及格message,不及格不及格message
		//70分以上的显示不同message
		
		int mark;
        Scanner keyboard = new Scanner (System.in);
		System.out.println("What exam mark did you get?");
		mark = keyboard.nextInt();
		
		if (mark < 40) {
			System.out.println("I'm sorry, but you failed.");
		}
		else {
			
			if (mark >= 70) {
				System.out.println("Congrats! You did exellent!");
				}
			else {
			System.out.println("Congrats! You passed.");
		}
			
				}
			}
		
	}


