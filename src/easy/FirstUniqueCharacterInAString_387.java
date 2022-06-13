package easy;

import java.util.LinkedHashMap;

/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1. 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1*/

public class FirstUniqueCharacterInAString_387 {
	public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            }
            else{
                mp.put(s.charAt(i), 1);
            }
        }
        /*char temp = ' ';
        for(Map.Entry<Character, Integer> m : mp.entrySet()){
            if(m.getValue() == 1){
                temp = m.getKey();
                break;
            }
        }*/
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i)) == 1){
                return i;
            }
            /*if(temp == s.charAt(i)){
                return i;
            }*/
        }
        return -1;
    }
}
