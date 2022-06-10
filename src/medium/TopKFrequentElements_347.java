package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]*/

public class TopKFrequentElements_347 {
	public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        Map<Integer, Integer> map = mp.entrySet().stream().sorted(Map.Entry.<Integer, Integer> comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        List<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            //System.out.println(entry.getKey());
            if(k>0){
                l.add(entry.getKey());
            }
            k--;
        }
        int[] ans = new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);        
        }
        return ans;
    }
}
