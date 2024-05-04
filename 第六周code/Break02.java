import java.util.Scanner;
public class Break02 {
	public static void main(String[] args) {
		//实现登陆验证,有3次机会.如果用户名为“Sam”,密码为666“,则提示登录成功
		//否则提示还有三次机会
		//使用for + break完成
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String key = "";
		int chanceRemain = 3;
		for(int i = 1; i <= 3; i++){
			System.out.println("请输入姓名:");
			name = myScanner.next();
			System.out.println("请输入密码:");
			key = myScanner.next();

		if ("Sam".equals(name) && "666".equals(key)){
			System.out.println("登录成功");
			break;
		}
			chanceRemain--;
			System.out.println("登录失败,还有 " + chanceRemain + " 次机会");
			
			}

		}
}

	