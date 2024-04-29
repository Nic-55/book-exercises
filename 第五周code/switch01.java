import java.util.Scanner;
public class switch01 {
	public static void main(String[] args) {
//用switch写一个程序,可以接收一个字符
//a表示星期一,b表示星期二,以此类推
//根据输入的字符显示相对应的日子

        Scanner keyboard = new Scanner(System.in);
		System.out.println("请输入一个字母(a - g)(小写):");
		char mark = keyboard.next().charAt(0);

		switch (mark) {
		case 'a' :
			System.out.println("今天是星期一");
		break;
		case 'b' :
			System.out.println("今天是星期二");
		break;
		case 'c' :
			System.out.println("今天是星期三");
		break;
		case 'd' :
			System.out.println("今天是星期四");
		break;
	    case 'e' :
			System.out.println("今天是星期五");
		break;
		case 'f' :
			System.out.println("今天是星期六");
		break;
		case 'g' :
			System.out.println("今天是星期日");
		break;
	    default:
			System.out.println("输入值有误.");
		}
		System.out.println("switch程序结束.");
	}
}