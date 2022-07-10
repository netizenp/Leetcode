package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9*/

public class LongestConsecutiveSequence_128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,3,7,2,5,8,4,6,0};
		System.out.println(new LongestConsecutiveSequence_128().longestConsecutive(arr));
	}
	
	public int longestConsecutive(int[] nums) {
		//Set<Integer> s = new HashSet<>();
		List<Integer> s = new ArrayList<>();
		for(int i : nums) {
			s.add(i);
		}
		int ans = 0;
		for(int i : nums) {
			if(!s.contains(i - 1)) {
				int it = i;
				int streak = 1;
				while(s.contains(it + 1)) {
					streak++;
					it++;
				}
				if(ans < streak) {
					ans = streak;
				}
			}
		}
		return ans;
    }

}
