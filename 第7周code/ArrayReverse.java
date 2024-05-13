public class ArrayReverse {
	public static void main(String[] args) {
		//要求:把数组内的数据顺序反转
		//先定义数组
		int[] arr = {11,22,33,44,55,66};
		//规律:
		//1.先把arr[0]和arr[5]交换
		//2.再把arr[1]和arr[4]交换
		//3.再把[2]和[3]交换.
		//共交换3次(也就是数组长度/2)
		//每次交换时,对应的下标是arr[i]和arr[arr.length - 1 - i]
     
		for(int i = 0; i < (arr.length / 2); i++){
			int temp = arr[arr.length - 1 - i];
			arr[arr.length - 1 -i] = arr [i];
			arr[i] = temp;
		}
		System.out.println("***反转后的数组***");
		for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + "\t");
	}


	}
}