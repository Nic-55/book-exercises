import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		double[] score = new double[5];
		//用户输入成绩
		for (int i = 0; i < score.length; i++){
			System.out.println("请给第 " + (i + 1) +" 个元素赋值.");
			score[i] = myScanner.nextDouble();
		}
		//挨个输出用户输入的成绩
		for (int i = 0; i < score.length; i++){
			System.out.println("第 " + (i + 1) + " 个元素的值为 " + score[i]);
		}

	}
}