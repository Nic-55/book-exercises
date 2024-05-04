public class MultiExercise02 {
	public static void main(String[] args) {
		//打印出九九乘法表

		for (int i = 1; i <= 9; i++){

			for (int j = 1; j <= 9; j++){
				System.out.print(i + " * " + j + " = " + (i * j) + '\t');
			}
			
		}
	}
}