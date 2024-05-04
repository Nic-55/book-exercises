import java.util.Scanner;
public class MultiExercise01 {
	public static void main(String[] args) {
	//统计3个班级的成绩情况,每个班五个人
	//求出各个班的平均分和所有班级的平均分(学生成绩键盘输入)
	//统计三个班及格的人数,每个班有5个人
	//思路
	//化繁为简:
	//1.先统计一个班的成绩(5个人) 用一个单层for循环
	//2.创建scanner,接收用户输入
	//3.得到这个班的平均分.先定义一个sum,求和.
		//到这里,一个班的平均分就求出来了,接下来求五个班的平均分
		//用一个for把一个班的求平均分包裹起来
		//定义一个变量去统计所有学生的总成绩
		//最后统计三个班的及格人数.定义变量pass
		//统计人数就是pass++ (放在哪里很重要)
	Scanner myScanner = new Scanner(System.in);
    double totalScore = 0;
    int passNum = 0;
    for(int i = 1; i <= 3; i++) {
		double sum = 0; //一个班的总分
    
	for (int j = 1; j <= 5;j++)	{
		System.out.println("请输入第 " + i + " 个班的第" + j + "个学生成绩: ");
		double score = myScanner.nextDouble();
		//在这里接收了成绩之后,马上判断是否及格
		if (score >= 60){
			passNum++; 
		}
		sum += score; //累计的分数,等于 sum = score+sum
		System.out.println(i + " 班的" + j + " 成绩为: " + score);
	}
	    System.out.println(i + " 班的平均分 : " + (sum / 5 ));
    totalScore += sum;
	}

	System.out.println("三个班的平均分= " + (totalScore / (5 * 3)));
	System.out.println("三个班及格总人数为= " + passNum);
}
}