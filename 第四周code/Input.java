import java.util.Scanner;
public class Input {
	public static void main(String[] args) {
	//键盘输入范例
	//步骤
		//1. 引入Scanner所在的包
		//2. 创建Scanner对象(理解成变量)
		// scanner 就是Scanner类的对象

	Scanner scanner = new Scanner (System.in); 
	    //3. 接收用户的输入,使用相关方法
	System.out.println("请输入名字");
	//当程序执行到next方法时,会等待用户输入,如果不输入就卡在这里了
	String name = scanner.next(); //这里接收用户输入的字符串,名字
    System.out.println("请输入年龄");
	int age = scanner.nextInt(); //这里接收输入的整数,年龄
	System.out.println("请输入收入");
	double salary = scanner.nextDouble();//接收输入的浮点数,收入
	System.out.println("此人信息如下:");
	System.out.println("名字=" + name + " 年龄=" + age + 
		" 收入=" + salary);
		
	}
}