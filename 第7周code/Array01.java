public class Array01 {
	public static void main(String[] args) {
		//定义一个数组
		double[] hens = {3,5,1,3.4,2,50};
		//如果没有[]就是primitive type的double,此处数组名为hens
		double totalWeight = 0;
		double averageWeight = 0;
		for (int i = 0; i < hens.length; i++){
			//System.out.println("第" + i + "个元素的值为 " + hens[i]);
			//通过for循环可以访问一个数组的元素(或称为值,叫法不同)
			totalWeight += hens[i];
			averageWeight = totalWeight / hens.length;
		}
		
			System.out.println("这些鸡的总重量为 " + totalWeight);
		
			System.out.println("这些鸡的平均重量为 " + averageWeight);

	}
}