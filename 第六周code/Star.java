import java.util.Scanner;
public class Star {
	public static void main(String[] args) {
		//空心金字塔
		//用for循环
		//要能接收一个整数,表示层数(totalLevel)
		//思路:(化繁为简)
	
		//这个案例要反复看
		Scanner myScanner = new Scanner(System.in);
		int inLevel = 0;
		System.out.println("请输入金字塔的层数: ");
		int totalLevel = myScanner.nextInt();
        
        for (int i = 1; i <= totalLevel; i++){ //i是层数
        	//每一层需要的空格
        	for (int s = 1; s <= (totalLevel - i); s++){
        		System.out.print(" ");
        	}
        	for (int j = 1; j <= 2 * i - 1; j++){
        		if(j == 1 || j == 2 * i - 1 || i == totalLevel){
        		System.out.print("*");
        	}else {
        		System.out.print(" ");
        	}
        } 
        //每打完一层星星就换行
        System.out.println("");
       }
	}
}
