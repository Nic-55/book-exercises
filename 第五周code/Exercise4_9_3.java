
public class Exercise4_9_3 {
	
	public static void main(String[]args) {
		/*用嵌套式for循环显示以下图形
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("*");
			}
			System.out.println();
		} */
	    /* 用if else显示以下图形
		for (int i = 1; i <= 6; i++) {
			if(i <= 2 || i >= 5) {
				for (int j = 1; j <= 3; j++) {
				System.out.print("*");
			}
			}
			else {
				for (int j = 1; j <= 9; j++) {
				System.out.print("*");
			}
			}
				System.out.println();
		} */
		
		//显示以下图形
		for (int i = 4; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
		
	}
