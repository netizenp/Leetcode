/*
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

   The test cases are generated so that the answer will fit in a 32-bit integer.

   A subarray is a contiguous subsequence of the array.
   
   Example 1:

   Input: nums = [2,3,-2,4]
   Output: 6
   Explanation: [2,3] has the largest product 6.
   
   Example 2:

   Input: nums = [-2,0,-1]
   Output: 0
   Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/
package medium;

public class MaximumProductSubarray_152 {
	public int maxProduct(int[] nums) {
        int result = nums[0];
        int max = 1, min = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                max = 1;
                min = 1;
                result = Math.max(0, result);
                continue;
            }
            int temp = max;
            max = Math.max(Math.max(nums[i] * max, nums[i] * min), nums[i]);
            min = Math.min(Math.min(nums[i] * temp, nums[i] * min), nums[i]);
            result = Math.max(max, result);
        }
        return result;
    }
}
