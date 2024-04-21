public class logicPra {
	public static void main(String[] args) {

		//逻辑运算符练习题
		int x = 5;
		int y = 5;
		if (x++ == 6 & ++y == 6) { 
			// 首先条件1: 因为是后++,先比较x值再自增,于是5不等于6,条件1为false.
			// 但因为是逻辑与&,条件2还是会被执行判定.前++于是6等于6,条件2为true.
			// 两个条件不符合both true,于是x=11不执行
			x=11;
		}
		System.out.println("x=" + x + " y=" + y);

		    //最后结果x为6,y为6

		//第二题
		int a = 5, b = 5;
		if (a++ == 5 | ++b ==5) {
			// 条件1:后++,先比较再递增,a=5,true,然后a递增成6.
			// 因为是逻辑或,还是要判断条件2,前++所以先自增后比较,6不等于5,false
			// 因为有一个是true,所以执行true.
			a = 11;
		}
		System.out.println("a=" + a + " b=" + b);
		//结果为a是11,b是6


		//第三题
        int x2 = 5;
		int y2 = 5;
		if (x2++ == 6 && ++y2 == 6) { 
			// 首先条件1: 因为是后++,先比较x2值再自增,于是5不等于6,条件1为false.
			// 但因为是短路与&,条件1false了,条件2不判断,y2还是5
			// 两个条件不符合both true,于是x=11不执行
			x2=11;
		}
		System.out.println("x2=" + x2 + " y2=" + y2);
		//结果为x2是6,y2是5

		//第四题
		int a2 = 5, b2 = 5;
		if (a2++ == 5 || ++b2 ==5) {
			// 条件1:后++,先比较再递增,a2=5,true,然后a2递增成6.
			// 因为是短路或,条件1已经true了,2不判定,b2还是5
			// 因为有一个是true,所以执行true.
			a2 = 11;
		}
		System.out.println("a2=" + a2 + " b2=" + b2);
		//结果为a2是11,b是5
       

	}
}

