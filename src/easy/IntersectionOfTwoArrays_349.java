package easy;

import java.util.ArrayList;
import java.util.List;

/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */

public class IntersectionOfTwoArrays_349 {
	public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            l.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(l.contains(nums2[i])){
                if(!ans.contains(nums2[i])){
                    ans.add(nums2[i]);
                }
            }
        }
        int[] result = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
