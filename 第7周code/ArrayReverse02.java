public class ArrayReverse02 {
	public static void main(String[] args) {
		//不用找规律的思路,用逆序赋值
		int[] arr = {11,22,33,44,55,66}; //原本数组
		int[] arr2 = new int[arr.length]; //创建新空间
		//开始逆序遍历
		for (int i = (arr.length - 1), j = 0; i >= 0; i--, j++){
			arr2[j] = arr[i];
		}
		arr = arr2; //把原本的arr指向新的数据空间,就反转了.

		System.out.println("***反转后的数组***");
		for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + "\t");
	}
}
}