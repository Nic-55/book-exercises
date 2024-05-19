public class Method03 {
	public static void main(String[] args) {
		A a = new A();
		a.sayOk(); //调用不同class下的method要创建object先
		a.m1();

	}
}
class A {
public void print(int n) {
	System.out.println("print()方法被调用 n= " + n);
}

public void sayOk() {
	print(10); //同一个class下调用不需要创建object
}
public void m1() { //在class a里调用class b的method
	System.out.println("m1()方法被调用.");
	B b = new B();
	b.hi();
}

}

class B {
	public void hi() {
		System.out.println("B类中的hi()方法被调用.");
	}
}