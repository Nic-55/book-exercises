public class OverLoad02 {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculator(1,2));
		System.out.println(mc.calculator(1,2.5));
		System.out.println(mc.calculator(1.5,2));
		System.out.println(mc.calculator(1,2,3));

	}
}

		class MyCalculator {

			//两个int的和
			public int calculator(int n1, int n2) {
				return n1 + n2;
			}

			//一个int,一个double的和
			public double calculator(int n1, double n2) {
				return n1 + n2;
			}

			//一个double,一个int的和
			public double calculator(double n1, int n2) {
				return n1 + n2;
			}

			//三个int的和
			public int calculator(int n1, int n2, int n3) {
				return n1 + n2 + n3;
			}

		}