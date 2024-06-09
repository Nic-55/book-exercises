public class MethodExercise01 {
	public static void main(String[] args) {
		//编写一个main方法
		AA aa = new AA();
		if (aa.isOdd(1)) {
			System.out.println("Is odd number.");
		}
		else {
			System.out.println("Is even number.");
		}

		aa.printShape(4,6,'*');

	}
}

//编写类AA,有一个方法:判断一个数是odd还是even,返回boolean
class AA{
	//思路
	//1.方法的返回类型
	//2.方法名
	//3.形参
	//4.方法体

	public boolean isOdd (int num) {
		if (num % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	//新方法
	//根据行,列,字符打印 对应行数和列数的字符
	//比如行4,列4,符号为星号*
	//返回类型void
	//形参 (int row, int col, char c)
	//方法题是循环
	public void printShape (int row, int col, char c) {
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++){ //这是控制输出每一行
				System.out.print(c);
			}
			System.out.println(); //这里换行
		}
	}
}
