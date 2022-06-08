package hard;

/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.*/

public class TrappingRainWater_42 {
	public int trap(int[] height) {
		int[] left = new int[height.length];
		int[] right = new int[height.length];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < height.length; i++) {
			left[i] = Math.max(max, height[i]);
			max = left[i];
		}
		max = Integer.MIN_VALUE;
		for (int i = height.length - 1; i >= 0; i--) {
			right[i] = Math.max(max, height[i]);
			max = right[i];
		}
		int ans = 0;
		for (int i = 0; i < height.length; i++) {
			ans += (Math.min(left[i], right[i]) - height[i]);
		}
		return ans;
	}
}
