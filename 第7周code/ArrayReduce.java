import java.util.Scanner;
public class ArrayReduce {
	public static void main(String[] args) {
		//在扩容基础上,添加用户可选是否继续删减的选项

        Scanner myScanner = new Scanner (System.in);
		int[] arr = {1,2,3,4,5,6}; //原数组
    do {
		int[] arrNew = new int[arr.length - 1]; //此处下标就删减了一个
		//遍历赋值
		for (int i = 0; i < arrNew.length; i ++){
			arrNew[i] = arr[i];
		}
		arr = arrNew; //让本来的数组指向添加过后的数组
		for (int i = 0; i < arr.length; i ++){
		System.out.print(arr[i] + "\t");
		}
		System.out.println("是否继续删减? y/n");
		char key = myScanner.next().charAt(0);
		if (key == 'n' || arrNew.length == 0) {
			break;
		}
	} while (true);
	}

	}
