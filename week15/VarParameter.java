public class VarParameter {
	public static void main(String[] args) {
		HspMethod hm = new HspMethod();
		System.out.println(hm.sum(1,5,100));
	}
}
class HspMethod {
	public int sum(int... nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}