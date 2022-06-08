package medium;

/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Input: height = [1,8,6,2,5,4,8,3,7]

Output: 49

Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.*/

public class ContainerWithMostWater_11 {
	public int maxArea(int[] height) {
		int low = 0, high = height.length - 1, ans = Integer.MIN_VALUE;
		while (low < high) {
			ans = Math.max(ans, ((high - low) * (Math.min(height[low], height[high]))));
			if (height[low] < height[high]) {
				low++;
			} 
			else {
				high--;
			}
		}
		return ans;
	}
}
