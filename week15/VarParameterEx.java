public class VarParameterEx {
	public static void main(String[] args) {
		HspMethod hm = new HspMethod();
        System.out.println(hm.showScore("Dave",90.5,80));
        System.out.println(hm.showScore("Bob",100,70.5,80,50));
		
	}
}

class HspMethod {
	//方法1: 返回姓名和两门课成绩(总分)
	//方法2: 返回姓名和三门课成绩(总分)
	//方法3: 返回姓名和五门课成绩(总分)
	//封装为可变参数方法

	public String showScore (String name, double... scores) {
		double totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + " " + scores.length + "门课的总分= " + totalScore;

	}
}