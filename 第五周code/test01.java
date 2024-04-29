import java.util.Scanner;
public class test01 {
	public static void main(String[] args) {
//第一题		
		double d1 = 34.5;
		double d2 = 2.6;
		if (d1 > 10.0 && d2 < 20.0) {
			System.out.println("两数之和=" + (d1 + d2));
		}

//第二题 判断两数之和是否能被3整除
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2; 
		if ( sum % 3 == 0) {
			System.out.println("可以整除,结果= " + sum);
		}
		else {
			System.out.println("不可以整除");
		}


//第三题 显示信用分评级
		
		int creditScore;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("请输入您的信用分(1-100):");
		creditScore = keyboard.nextInt();

		if (creditScore >=1 && creditScore <=100) {

		if (creditScore == 100)
			System.out.println("信用极好");
		else if (creditScore > 80 && creditScore <= 99)
			System.out.println("信用优秀");
		else if (creditScore >= 60 && creditScore <= 80)
			System.out.println("信用一般");
		else {
			System.out.println("信用不及格");
		}

	    }
	    else {
	    	System.out.println("输入有误,请重新输入.");
	    }

		}
 
		} 
	
