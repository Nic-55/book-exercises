public class doWhileEx {
	public static void main(String[] args) {
		//输出10句你好
		int i = 1;
		do {
			System.out.println("你好." + i);
			i++;
		}
		while (i <= 10);
		System.out.println("本次do while循环结束,继续后续程序.");

		//打印1-100
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}
		while (a <= 100);
		System.out.println("本次do while循环结束,继续后续程序.");

		//
		int b = 1;
		int sum = 0;
		do {
			sum += b;
			b++;
		}
		while (b <= 100);
		System.out.println("1-100的合= " + sum);
		System.out.println("本次do while循环结束,继续后续程序.");

		//统计1-200之间能被5整除,但不能被3整除的个数
		int c = 1;
		int count = 0;
		do {
			if (c % 5 == 0 && c % 3 != 0){
			    count++;
			}
			c++;
		}
		while (c <= 200);
		System.out.println("1-200之间符合条件的数字有 " + count + " 个");
		System.out.println("本次do while循环结束,继续后续程序.");

	}

}