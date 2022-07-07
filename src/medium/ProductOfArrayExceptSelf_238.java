package medium;

/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]*/

public class ProductOfArrayExceptSelf_238 {
	public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0]=nums[0];
        for(int i=1;i< nums.length;i++){
            left[i]=left[i-1]*nums[i];
        }
        right[nums.length-1]=nums[nums.length-1];
        for(int i= nums.length-2;i>=0;i--){
            right[i]=right[i+1]*nums[i];
        }
        nums[0]=right[1];
        nums[nums.length-1]=left[nums.length-2];
        for(int i=1;i< nums.length-1;i++){
            nums[i]=left[i-1]*right[i+1];
        }
        return nums;
    }
}
