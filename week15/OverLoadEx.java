public class OverLoadEx {
	public static void main(String[] args) {
		Methods methods = new Methods();
		
		methods.m(5);
		methods.m(5,6);
		methods.m("test run");

		System.out.println(methods.max(2,3));
		System.out.println(methods.max(2.5,3.5));
		System.out.println(methods.max(2.5,3.5,4.5));
	}
}

class Methods {
	//定义三个重载方法并调用,方法名为m.
	//分别接受一个int,两个int,一个字符串
	//第一个执行平方运算,第二个执行乘法运算,第三个直接输出字符串信息.
	public void m(int n1) {
		System.out.println(n1 + " 的平方= " + n1 * n1);
	}
	public void m(int n1,int n2) {
		System.out.println(n1 + " 乘以 " + n2 + " = " + n1 * n2);
	}
	public void m(String s) {
		System.out.println("传入的string内容: " + s);
	}

	//定义三个重载方法max
	//第一个返回两个int中的最大
	//第二个返回两个double中的最大
	//第三个返回三个double中的最大
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;	
	}
	public double max(double n1, double n2, double n3) {
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
}