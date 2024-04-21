public class ariOp2 {
public static void main(String[] args) {
	//课堂习题2
        //1. 还有59天放假,合算几个星期零几天
        //编程思路
	    //得到需求-分析思路-设计代码
	//因为是天数,用int
	//因为是星期,用int.一个星期是7天,就是days / 7
	//零几天,是days % 7取模,也得是int

	int days = 59;
	int weeks = days / 7;
	int remain = days % 7;
	System.out.println(weeks +" weeks" + " and " + remain + " days until vacation!");


        //2.定义一个变量保存华氏温度,求出摄氏温度
	    //转换公式:5/9*(华氏度-100)
	    //因为是温度,用double
	double ft = 234.5;
	double ct = 5d / 9 * (ft - 100);
	System.out.println("华氏度 " + ft + " 相当于 " + ct + " 摄氏度.");



 }
}