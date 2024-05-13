public class ArrayAdd {
	public static void main(String[] args) {
		//扩容数组
		//在已有的一个数组内添加一个元素4
		//思路:定义一个新数组 arrNew = new int[arr.length + 1].解决下标范围问题
		//把新int4赋值给 [arr.length - 1]= 4 (这里-1是因为0开头)
		//最后把arr指向新数组

		int[] arr = {1,2,3}; //原数组
		int[] arrNew = new int[arr.length + 1]; //此处下标就增加了
		//遍历赋值
		for (int i = 0; i < arr.length; i ++){
			arrNew[i] = arr[i];
		}
		arrNew[arrNew.length - 1] = 4; //此处把新值4赋给最后一位
		arr = arrNew; //让本来的数组指向添加过后的数组
		for (int i = 0; i < arr.length; i ++){
		System.out.print(arr[i] + "\t");
		}
	}

	}
