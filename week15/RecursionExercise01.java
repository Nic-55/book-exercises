public class RecursionExercise01 {
	public static void main(String[] args) {
		//用递归方式求斐波那契数列
		T t1 = new T();
		int n = 7;
		int res = t1.fibonacci(n);
		if (res != -1) {
		System.out.println("当n为" + n + "时,对应的斐波那契数为: " + res);
	}
	}
}

class T {
	public int fibonacci(int n) {
		if (n >= 1) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	} else {
		System.out.println("Invalid input, must be greater than 1.");
		return -1;
	}
	}
}