public class ArrayP1 {
	public static void main(String[] args) {
		//创建一个char类型的26个元素数组
		//分别放置A-Z
		//使用for loop访问所有元素并打印
		//提示:char类型数据运算'A'+1 -> 'B'

		char [] alphabetUpper = new char [26];
		for (int i = 0; i < alphabetUpper.length; i++){
			alphabetUpper[i] = (char)('A' + i); //此处结果是int,要强转成char
			
		}
		    System.out.println("***大写字母***");
		    for (int i = 0; i < alphabetUpper.length; i++){
		    System.out.print(alphabetUpper[i] + " ");
		}
	}
}
