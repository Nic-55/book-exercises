public class MiGong {
	public static void main(String[] args) {
		//创建一个8行7列的迷宫,用二维数组表示
		//规定map数组的元素值:0表示可以走,1表示障碍物

		//最上一行和最下一行都是1,障碍物
		int [][] map = new int[8][7];
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		} 
        //最左和最右一列都是1,障碍物
		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		} 
		//单独设置两处无规律的障碍
        map[3][1] = 1;
        map[3][2] = 1;

		//输出当前迷宫
		System.out.println("======当前迷宫情况======");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " "); //输出一行
			}
			System.out.println();
	}
	//使用findway开始找路
	T t1 = new T();
	t1.findWay(map,1,1);
    System.out.println("======找路情况如下======");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " "); //输出一行
			}
			System.out.println();
	}
  }
}
class T {
	//用递归回溯的思想
	public boolean findWay(int[][] map, int i, int j) {
		/* 用来找到路径的方法,找到是true,找不到false
		i和j表示所在位置,初始在1,1 (j是列,i是行)
		终点是6,5
		因为是递归找路,要先规定号map数组各个值的含义
		0可以走,1障碍物,2可以走,3表示走过但不通的死路
		确定好找路策略(方向优先级) 下 - 右 - 上 - 左
		当map[6][5] = 2,找到通路,程序结束.否则继续找 */

		if (map [6][5] == 2) {//已经找到
			return true;
		} else {
			if (map[i][j] == 0) {//说明可以走
				//假定可以走
				map[i][j] = 2;
				//使用找路策略
				if (findWay(map, i + 1, j)) { //向下走
					return true;
				} else if (findWay(map, i, j + 1)) { //向右走
					return true;
				} else if (findWay(map, i - 1, j)) { //向上走
					return true;
				} else if (findWay(map, i, j-1)) { //向左走
					return true;
				} else {
					map [i][j] = 3;  //因为以上四个方向都走不通,所以为3,死路
					return false;
				}

				} else { //map[i][j] = 1,2,3
				return false;
			}
			}
		}
}