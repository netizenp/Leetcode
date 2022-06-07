package medium;

import java.util.HashMap;
import java.util.Map;

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
