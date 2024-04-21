public class logicPra2 {
	public static void main(String[] args) {
		//逻辑运算符练习题2
		boolean x = true;
		boolean y = false;
		short z = 46;
		if ((z++ == 46) && (y = true)) z++;
		// 后++,先比较后自增,条件1为true,z为47.
		//条件2, y被重新赋值为true,整个短路与结果为true,z++,z此刻为48.
		if ((x = false) || (++z == 49)) z++;
		//条件1,x被重新定义为false,因为是短路或,判定条件2
		//先++,所以z此刻为49,条件2为true,满足逻辑或
		//执行z自增,z此刻为50.
		System.out.println("z=" + z);
		//最终结果为z是50
	}
} 