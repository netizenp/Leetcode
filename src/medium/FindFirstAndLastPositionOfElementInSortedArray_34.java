package medium;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
	public int[] searchRange(int[] nums, int target) {
		int first = -1, second = -1;
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i] && first == -1) {
				first = i;
				second = i;
			} 
			else if (target == nums[i] && first != -1) {
				second = i;
			}
		}
		int arr[] = { first, second };
		return arr;
	}
}
