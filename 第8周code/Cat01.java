public class Cat01 {
	public static void main(String[] args) {
		//要求:养两只猫,一只叫小白,三岁,白色
		//一只叫小花,100岁,花色.
		//边写一个程序,当用户输入猫的名字,显示名字,年龄和花色.
		//如果名字输入错误,则显示没有这只猫
		//用类和对象的方式解决

		//首先定义一个猫class
		//实例化(创建)一只猫object 和第二只猫(第二个object)
        Cat cat1 = new Cat(); //把创建的猫赋给cat1
        cat1.name = "小白";
        cat1.age = 3;
        cat1.colour = "白色";

        Cat cat2 = new Cat(); //创建第二只猫,并赋给cat2
        cat2.name = "小花";
        cat2.age = 100;
        cat2.colour = "花色";

        //访问一个object的property的方法
        System.out.println("第一只猫的信息 " + cat1.name + " " + cat1.age + " " + cat1.colour);
        System.out.println("第二只猫的信息 " + cat2.name + " " + cat2.age + " " + cat2.colour);

	}
}
class Cat {
			String name;
			int age; 
			String colour;
		}