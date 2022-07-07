package easy;

/*You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:
Input: nums = [5], k = 1
Output: 5.00000*/

public class MaximumAverageSubarrayI_643 {

	public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0, maxAvg = 0, avg = 0;
        for(int i=0;i<k;i++){
            windowSum += nums[i];
        }
        maxAvg = windowSum / k;
        int i = 1, j = k;
        while(j < nums.length){
            windowSum = windowSum - nums[i-1];
            windowSum = windowSum + nums[j];
            avg = windowSum / k;
            if(maxAvg < avg){
                maxAvg = avg;
            }
            i++; j++;
        }
        return maxAvg;
    }

}
