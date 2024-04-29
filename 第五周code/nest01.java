import java.util.Scanner;
public class nest01 {
	public static void main(String[] args) {
		
		/* 歌手比赛
		要求输入选手性别和成绩
		初赛成绩大于8.0则进入决赛,否则提示淘汰.
		并且根据性别进入男子组或女子组 */
        
		Scanner keyboard = new Scanner(System.in);
		System.out.println("请输入您的比赛成绩:");
		double score = keyboard.nextDouble();
		

		if (score > 8.0) {
			System.out.println("请输入您的性别:(M / F)");
		    char gender = keyboard.next().charAt(0);

			if (gender == 'M') 
			    System.out.println("恭喜您,进入男子组决赛.");

			else if (gender == 'F')
				System.out.println("恭喜您,进入女子组决赛.");

			else 
				System.out.println("输入有误,请重新输入.");
					}
		else {
			System.out.println("对不起,您已淘汰.");
		}
		keyboard.close();


	}
}