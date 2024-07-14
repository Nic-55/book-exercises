public class HanNuoTa {
	public static void main(String[] args) {

		Tower tower = new Tower();
		tower.move(2,'A','B','C');
		
	}
}
class Tower {

	/* a method
	num: number of disks to be moved 
	a,b,c: 3 towers 
	*/

	public void move (int num, char a, char b, char c) {

		//如果只有一个disk
		if (num == 1) {
			System.out.println(a + " -> " + c);
		} else {
			//如果有多个disks,就可以看作两个:一个是最下面的盘,另一个是上面所有disks(num - 1)
			//1.先移动上面所有盘到b,借助c
			move (num - 1, a, c, b);
			//2.把最下方的disk移动到c
			System.out.println(a + " -> " + c);
			//3. 把b上的所有disks移动到c,借助a
			move (num - 1, b, a, c);

		}

	}
}