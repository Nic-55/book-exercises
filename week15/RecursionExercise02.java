public class RecursionExercise02 {
	public static void main(String[] args) {
		/*猴子吃桃问题
		一堆桃子,猴子第一天吃了其中一半,又多吃了一个.以后每天都吃剩下的一半外加一个.
		到第十天时,还没吃,发现只剩下一个桃子了.
		最初有几个桃子? */

		/*思路:逆推
		day = 10, peach 1.
		day = 9, (day10 + 1) * 2 = 4
		day = 8, (day9 + 1) * 2 = 10
		规律:前一天的桃子 = (后一天的桃子 + 1) * 2  */

		P p1 = new P();
		int day = 2;
		int peachNum = p1.peach(day);
        if (peachNum != -1) {
        	System.out.println("第 " + day + " 天有 " + peachNum + "个桃子." );
        }
		
	}
}

class P {
    public int peach (int day) {
	if (day == 10) { //题干已知条件
		return 1;
	} else if (day >= 1 && day <= 9) {
		return (peach(day + 1) + 1) * 2;
	} else {
		System.out.println("Invalid input, must be from day 1 to day 10.");
		return -1;
	}
}
}