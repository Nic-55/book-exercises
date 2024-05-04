public class forExercise {
	public static void main(String[] args) {
		//打印1-100之间,所有是9的倍数的整数.统计个数+总数.
		//1.先完成输出1-100的值
		//2.在输出过程中进行过滤:只输出9的倍数.
		
		int count = 0; //统计个数
		int total = 0; //求出总和
		
		for (int i = 1; i <= 100; i++){
			if (i % 9 == 0){
			System.out.println("i=: " + i);
		    count++;
		    total += i;   
		}
	}
		   System.out.println("9的整数倍数共有: " + count + " 个.");
		   System.out.println("9的整数倍数总和为: " + total);
	}

	} 