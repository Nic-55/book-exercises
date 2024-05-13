public class ArrayP2 {
	public static void main(String[] args) {
		//求出一个数组int[]的最大值{4,-1,9,10,23},并且得到对应的index
		//思路:假定max = a[0],maxIndex = 0;
		//从index1开始遍历,如果max小于当前元素,说明max不是最大值
		//最大值出现交换, maxIndex = 当前元素index
		//遍历整个数组后就得到了真正的最大值

		int[] a = {4,-1,9,10,23};
		int max = a[0];
		int maxIndex = 0;

		for(int i = 1; i < a.length; i++){
			if (max < a[i]){
				max = a[i];
				maxIndex = i;
			}
		
	}
       System.out.println("数组a的最大值为: " + max);
       System.out.println("数组a的最大值下标为 : " + maxIndex);

	}
}