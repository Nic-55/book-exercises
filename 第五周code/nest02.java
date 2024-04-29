import java.util.Scanner;
public class nest02 {
	public static void main(String[] args) {

		/*
        出票系统,根据淡旺季的月份和游客的年龄,输出票价
        4-10月 旺季
        成年人(18 - 60)60元
        儿童(<18) 半价
        老人(>60) 1/3价格
        其余季节淡季
        成人 40
        其他 20
		 */

        int highPrice = 60;
        int lowPrice = 40;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("请输入游玩月份:");
		int season = keyboard.nextInt();

		if (season >= 4 && season <= 10) {
			System.out.println("请输入您的年龄:");
		    int age = keyboard.nextInt();
		    if (age >= 18 && age <= 60)
		    	System.out.println("票价为:" + highPrice + "元.");
		    else if (age < 18)
		    	System.out.println("票价为:" + (highPrice / 2) + "元.");
		    else if (age > 60)
		    	System.out.println("票价为:" + (highPrice / 3) + "元.");
		}
		else {
			System.out.println("请输入您的年龄:");
		    int age = keyboard.nextInt();
		    if (age >= 18 && age <= 60)
		    	System.out.println("票价为:" + lowPrice + "元.");
		    else
		    	System.out.println("票价为:" + (lowPrice / 2) + "元.");
		}

	}
}