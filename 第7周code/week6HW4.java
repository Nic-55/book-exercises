public class week6HW4 {
	public static void main(String[] args) {
		//判断一个数是否是水仙花数
		//水仙花数的定义是一个3位数,其各个位上的数字立方之和等于其本身
		//例如: 153 = 1*1*1 + 3*3*3 + 5*5*5
		//思路:先分别得到n的百位数,十位数和个位数

        int NarNum = 100;
        int h = NarNum / 100;
        int t = (NarNum % 100) / 10;
        int s = NarNum % 10;
		
		if (NarNum == h*h*h + t*t*t + s*s*s){
			System.out.println(NarNum + " 是水仙花数");
		}
		else {
			System.out.println(NarNum + " 不是水仙花数");
		}
	}
}