public class Break01 {
	public static void main(String[] args) {
		//1-100以内的数求和.当和第一次大于20的时候,记录下当前数,然后break、
        int i;
		int sum = 0;
		for (i = 1; i <= 100; i++){
            
            sum += i;
            if(sum > 20) {
            	System.out.println("和第一次大于20的值为: " + i);
          	break;
          }
          }
        System.out.println("和第一次大于20的值为: " + i);
        //此处是练习想在作用域外显示变量时,要注意变量定义位置
	}
}
 