package medium;

public class RotateArray_189 {

	public void rotate(int[] nums, int k) {
		if (nums.length == 1) {
			return;
		}
		if (k > nums.length) {
			k = k % nums.length;
		}
		int first = nums.length - k;
		for (int i = 0, j = (first - 1); i < first / 2; i++, j--) {
			nums[i] = nums[i] + nums[j];
			nums[j] = nums[i] - nums[j];
			nums[i] = nums[i] - nums[j];
		}
		for (int i = first, j = (nums.length - 1); i < (nums.length + first) / 2; i++, j--) {
			nums[i] = nums[i] + nums[j];
			nums[j] = nums[i] - nums[j];
			nums[i] = nums[i] - nums[j];
		}
		for (int i = 0, j = (nums.length - 1); i < nums.length / 2; i++, j--) {
			nums[i] = nums[i] + nums[j];
			nums[j] = nums[i] - nums[j];
			nums[i] = nums[i] - nums[j];
		}
	}

}
