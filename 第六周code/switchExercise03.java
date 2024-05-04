import java.util.Scanner;
public class switchExercise03 {
	public static void main(String[] args) {
//根据用户指定的月份,显示该月所属季节.3-5春,6-8夏,9-11秋,12-2冬.
		//提示:使用穿透

		//思路:1.创建scanner,用int接收月份输入
		//2.switch匹配,使用穿透完成,简洁
        
        Scanner keyboard = new Scanner(System.in);
		System.out.println("请输入一个月份(1-12):");
		int month = keyboard.nextInt();

		switch (month) {
		case 3,4,5 :
			System.out.println("春季.");
		break;
		case 6,7,8 :
			System.out.println("夏季.");
		break;
		case 9,10,11 :
			System.out.println("秋季.");
		break;
		case 12,1,2:
			System.out.println("冬季.");
		break;
	    default:
			System.out.println("您的输入有误.");
		} 

		}

	}