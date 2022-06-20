package medium;

import java.util.HashMap;

/*Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2*/

public class SubarraySumEqualsK_560 {
	public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int currentSum = 0, count = 0;
        for(int i=0;i<nums.length;i++){
            currentSum += nums[i];
            if(currentSum - k == 0){
                count++;
            }
            if(mp.containsKey(currentSum - k)){
                count += mp.get(currentSum - k);
            }
            if(mp.containsKey(currentSum)){
                mp.put(currentSum, mp.get(currentSum) + 1);
            }
            else{
                mp.put(currentSum, 1);
            }
        }
        return count;
    }
}
