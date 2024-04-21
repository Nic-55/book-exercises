public class TernaryOp {
	public static void main(String[] args) {
		int a = 10;
		int b = 99;
		// a > b为false,返回的是2,b--
		//先返回b的值,然后再自减.
		//所以返回的结果还是99.
		int result = a > b ? a++ : b--;

		System.out.println(result);
		System.out.println("a=" + a); //10
		System.out.println("b=" + b); //98

		//随堂练习
		//求出三个数中的最大值
		int n1 = 553;
		int n2 = 33;
		int n3 = 123;
		//思路:先比n1和n2找出最大,然后跟n3比
		// int max1 = n1 > n2 ? n1: n2;
		// int max2 = max1 > n3 ? max1 : n3;
		// System.out.println("The largest number is " + max2);

		//试着用一条语句实现
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println("The largest number is " + max);
	}
}