public class Method01 {
	public static void main(String[] args) {
		//方法使用的步骤
		//方法写好后,不调用就不生效
		Person person1 = new Person(); //这里是在创建对象
		person1.speak(); //这里是在调用方法
		person1.cal01();
		person1.cal02(5);//调用cal02,并给它一个值
		person1.cal02(10);//同一个方法可以调用多次并赋不同的值

		//此处需要declare一个variable去接收这个方法所返回的值
		int returnResult = person1.getSum(10,20);
		System.out.println("getSum返回的值= " + returnResult);
	}
}

class Person {
	String name;
	int age;

    //这个speak就是一个成员方法
	//这个方法就是要输出一句话
	//void就是没有返回值
	public void speak () {
		System.out.println("一个人");
	}

	//添加一个cal01 method,用来计算从1到1000累计相加的结果

	public void cal01 () {
		int result = 0;
		for (int i = 1; i <= 1000; i++) { 
			result += i;
		}
		System.out.println("cal01计算结果= " + result);
	}

	//添加一个cal02 method,可以接受一个数n,计算从1到n的累积相加结果

	public void cal02 (int n) {
        int result = 0;
		for (int i = 1; i <= n; i++) { 
			result += i;
		}
		System.out.println("cal02计算结果= " + result);

	}
    
    //添加一个方法,计算两数之和并返回这个和的值
    //这里不用void因为有返回值,return value是整数所以是int
    //parameter这里是几个值,什么类型的值,接收的值就必须符合
	public int getSum (int num1, int num2) {
        int result = num1 + num2;
        return result; 
    }
}
