import java.util.Scanner;
public class switchExercise {
	public static void main(String[] args) {
//使用switch把大写字母前五位转换成对应小写,其余的显示other.
        
        Scanner keyboard = new Scanner(System.in);
		System.out.println("请输入一个字母(A - Z)(大写):");
		char lowerCase = keyboard.next().charAt(0);

		switch (lowerCase) {
		case 'A' :
			System.out.println("a.");
		break;
		case 'B' :
			System.out.println("b.");
		break;
		case 'C' :
			System.out.println("c.");
		break;
		case 'D' :
			System.out.println("d.");
		break;
	    case 'E' :
			System.out.println("e.");
		break;
	    default:
			System.out.println("Others.");
		}
		 System.out.println("switch程序结束.");

		}

	}