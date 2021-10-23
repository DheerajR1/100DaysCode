public class Day2 {
    public static int findPeakElement(int[] nums) {
		int peak = -1;

		for (int i = 1; i < nums.length - 1; i++) {
			if ((nums[i - 1] < nums[i]) && (nums[i] > nums[i + 1])) {
				peak = i;
			}
		}

		return peak;
	}

	public static void main(String[] args) {
		/******** DAY 2 ********/
		int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
		int res = findPeakElement(nums);
		System.out.println((res == -1 ? "not found" : res));
		/******** DAY 2 ENDS ***/
	} 
}
