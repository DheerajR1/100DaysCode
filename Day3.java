import java.util.Arrays;

public class Day3 {

    public static int[] intersect(int[] nums1, int[] nums2) {
		int interectection[] = new int[nums1.length >= nums2.length ? nums2.length : nums1.length];
		Arrays.fill(interectection, -1);
		int count = 0;
		for (int i = 0; i < (nums1.length >= nums2.length ? nums1.length : nums2.length); i++) {
			for (int j = 0; j < (nums1.length >= nums2.length ? nums2.length : nums1.length); j++) {
				if (nums1.length >= nums2.length) {
					if (nums1[i] != -1 && nums1[i] == nums2[j]) {
						interectection[count] = nums1[i];
						nums1[i] = -1;
						nums2[j] = -1;
						count++;
					}
				} else {
					if (nums2[i] != -1 && nums2[i] == nums1[j]) {
						nums2[i] = -1;
						nums1[j] = -1;
						interectection[count] = nums2[i];
						count++;
					}
				}
			}
		}
		return interectection;
	}

	public static void main(String[] args) {
		/******** DAY 3 ********/
		int[] nums1 = { 1, 2, 2, 3, 1 };
		int[] nums2 = { 1, 4, 3, 1 };
		int[] res1 = intersect(nums1, nums2);
		for (int i = 0; i < res1.length; i++) {
			System.out.println(res1[i] != -1 ? res1[i] : "");
		}
		/******** DAY 3 ENDS ***/
	}
}
