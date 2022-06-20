package easy;

/*Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
 * Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 * 
Example 1:
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4

Example 2:
Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0

Example 3:
Input: nums = [2,5]
Output: -1
Explanation: There is no valid middleIndex.*/

public class FindTheMiddleIndexInArray_1991 {
	public int findMiddleIndex(int[] nums) {
        int rightSum = 0;
        for(int i : nums){
            rightSum += i;
        }
        int tempSum = 0;
        for(int i=0;i<nums.length;i++){
            if(tempSum == (rightSum - tempSum - nums[i])){
                return i;
            }
            tempSum += nums[i];
        }
        return -1;
    }
}
