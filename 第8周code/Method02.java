public class Method02 {
	public static void main(String[] args) {
		//要求遍历一个数组,输出数组的各个元素值

		int[][]map = {{0,0,1},{1,1,1},{1,1,3}};

		//用method调用,实现不断重复

		MyTools myTools = new MyTools();

		myTools.printArr(map);
		myTools.printArr(map);
		myTools.printArr(map);
	}
	}

	//把遍历数组写到方法里
	class MyTools{
		public void printArr(int[][] map){
			System.out.println("**********");
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
