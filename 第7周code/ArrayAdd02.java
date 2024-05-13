import java.util.Scanner;
public class ArrayAdd02 {
	public static void main(String[] args) {
		//在扩容基础上,添加用户可选是否继续添加的选项

        Scanner myScanner = new Scanner (System.in);
		int[] arr = {1,2,3}; //原数组
    do {
		int[] arrNew = new int[arr.length + 1]; //此处下标就增加了
		//遍历赋值
		for (int i = 0; i < arr.length; i ++){
			arrNew[i] = arr[i];
		}
		System.out.println("请输入需要添加的元素: ");
        int addNumber = myScanner.nextInt();
		arrNew[arrNew.length - 1] = addNumber; //此处把新值4赋给最后一位
		arr = arrNew; //让本来的数组指向添加过后的数组
		for (int i = 0; i < arr.length; i ++){
		System.out.print(arr[i] + "\t");
		}
		System.out.println("是否继续添加? y/n");
		char key = myScanner.next().charAt(0);
		if (key == 'n') {
			break;
		}
	} while (true);
	}

	}
