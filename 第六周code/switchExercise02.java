import java.util.Scanner;
public class switchExercise02 {
	public static void main(String[] args) {
//对学生成绩大于60分的显示合格,小于60的显示不合格,(输入的成绩不能高于100)
        
        Scanner keyboard = new Scanner(System.in);
	System.out.println("请输入您的成绩(0-100):");
	double score = keyboard.nextDouble();

	if (score >= 0 && score <= 100) {

	switch ((int)(score / 60)) {
		case 0 :
			System.out.println("您的成绩低于60分,不合格.");
		break;
		case 1 :
			System.out.println("您的成绩高于60分,合格.");	
		}
	      } else {
	      	System.out.println("您的输入有误.");
	      
		}
        }
	}