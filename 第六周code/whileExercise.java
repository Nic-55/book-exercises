public class whileExercise {
	public static void main(String[] args) {
		//1.输出10句你好
		int i = 1; //循环变量初始化
		while (i <= 5){ //循环条件
			System.out.println("你好." + i);
			i++;
		}
		System.out.println("退出while循环.");

		//2.打印1-100之间所有能被3整除的数,用while
		int ii = 1;
		while (ii <= 100){
			if (ii % 3 == 0){
				System.out.println("i= " + ii);
			}
			ii++;
		}
		System.out.println("退出while2循环.");

		//打印40-200之间所有偶数,用while
		int iii = 40;
		while (iii <= 200){
			if (iii % 2 == 0){
				System.out.println("i= " + iii);
			}
			iii++;
		}
		System.out.println("退出while3循环.");


	}
}