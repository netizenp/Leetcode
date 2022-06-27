package medium;

import java.util.HashMap;
import java.util.Map;

/*Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

public class LongestSubstringWithoutRepeatingCharacters_3 {
	public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int count = 0, max = Integer.MIN_VALUE;
        for(int i=0,j=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i), i);
                count++;
            }
            else {
                if(count > max){
                    max = count;
                }
                int temp = mp.get(s.charAt(i));
                while(j <= temp){
                    mp.remove(s.charAt(j));
                    count--;
                    j++;
                }
                i--;
            }
        }
        if(max < count){
            max = count;
        }
        return max;
    }
}
