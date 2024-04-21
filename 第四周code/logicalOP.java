public class logicalOP {
	public static void main(String[] args) {
		//逻辑运算符的使用
		//&& and &案例
		/*int age = 50;
		if (age > 20 && age < 90) {
			System.out.println("group1"); //输出成功 */

	    /*  int age = 50;
		if (age > 20 && age < 30) {
			System.out.println("group1"); //不输出 */

			int age = 50;
		if (age > 60 && age < 90) {
			System.out.println("group1"); //条件一为false,&&直接不判断第二个条件
		}


		//||短路或 和 |逻辑或
		if (age > 20 | age < 30) {
			System.out.println("group2");
		}

		if (age > 20 || age < 30) {
			System.out.println("group2");
		}


        int a = 4;
        int b = 9;
		if (a > 1 || ++b > 4) {
			System.out.println("group3");
			System.out.println("a=" + a + "b=" + b); 
			//结果是a4 b9
			//因为是短路,条件1满足后条件2就不执行了,就没有进行b前自增,还是9

		}

		if (a > 1 | ++b > 4) {
			System.out.println("group3");
			System.out.println("a=" + a + "b=" + b);
			//结果是a4 b10
			//因为是逻辑,条件1满足后仍然执行条件2且判断,执行了自增,b就是10

		}


		//negation取反演示
		System.out.println(60 > 20); //结果true
		System.out.println(!(60 > 20)); //结果为false


		//^异或
		boolean c = (10 > 1) ^ (3 < 5);
		System.out.println("c=" + c); //结果c=false, both true

		boolean d = (10 > 11) ^ (3 < 5);
		System.out.println("d=" + d); //结果d=true



		
	
	

	}
}