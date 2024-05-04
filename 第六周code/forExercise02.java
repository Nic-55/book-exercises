public class forExercise02 {
	public static void main(String[] args) {
	//把加法结果为5的各种可能列出来.
	//思路:化繁为简
	//先输出0-5
		int top = 10;
		int low = 0;

		for (int i = low; i <= top; i++) {
			System.out.println(i + " + " + (top - i) + " = " + top);
		}
	}
}