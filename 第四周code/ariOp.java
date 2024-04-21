public class ariOp {
	public static void main(String[] args) {
		//division
		System.out.println(10 / 4); //结果2,因为是int
		System.out.println(10.0 / 4); //结果2.5
		double d = 10 / 4; 
		System.out.println(d); //结果2.0,因为把int赋给了double
        

        //取模(取余) %
        System.out.println(10 % 3); //结果是1,余数
        System.out.println(10.0 % 3); //结果1.0
        System.out.println(-10 % 3); //-1
        System.out.println(10 % -3);  //1


        //自增

        int i = 10;
        i++; // i = i + 1
        ++i; // same when used on its own
        System.out.println("i=" + i);


        //作为表达式使用

        int j = 8;
        int k = ++j; // j=j+1;k=j; (等于两条语句)
        System.out.println(j); //9
        System.out.println(k); //9

        int n = 8;
        int m = n++; // n=m;m=m+1;  
        System.out.println(n); 
        System.out.println(m);

        //面试题1
        int a = 1;
        a = a++;
        System.out.println(a);
        // 因为后加加的用法就是先赋值再自增,所以结果还是1

       //面试题2
        int b = 1;
        b = ++b;
        System.out.println(b);
        //结果是2,因为跟后加加相反,前加加是先自增再赋值

        //自增自减练习题
        int i1 = 10;
        int i2 = 20;
        int ii = i1++;
        System.out.println("ii= " + ii); //10
        System.out.println("i2= " + i2); //20
        ii = --i2;
        System.out.println("ii= " + ii); //19
        System.out.println("i2= " + i2); //20

	}
}