public class MethodExercise02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		AA aa = new AA();
		aa.swap(a,b);
		System.out.println("主方法中: a = " + a + "\tb= " + b);
	}

	}
	class AA {
		//完成a和b的交换
		public void swap (int a, int b){
			System.out.println("交换前: a = " + a + "\tb= " + b);
			int temp = a;
			a = b;
			b = temp;
			System.out.println("交换后: a = " + a + "\tb= " + b);

		}

	}