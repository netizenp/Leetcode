package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []

Example 3:
Input: nums = [0]
Output: []*/

public class ThreeSum_15 {
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                if(mp.containsKey((-1) * (nums[i] + nums[j]))){
                    if(mp.get((-1) * (nums[i] + nums[j])) > j){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[mp.get((-1) * (nums[i] + nums[j]))]);
                        l.add(temp);
                    }
                }
            }
        }
        return l;
    }
}
