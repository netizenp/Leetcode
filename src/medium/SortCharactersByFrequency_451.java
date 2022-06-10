package medium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.*/

public class SortCharactersByFrequency_451 {
	public String frequencySort(String s) {
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            }
            else{
                mp.put(s.charAt(i), 1);
            }
        }
        Map<Character, Integer> sortedByValueDesc = mp.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        StringBuilder str = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : sortedByValueDesc.entrySet()){
            int i = entry.getValue();
            while(i-->0){
                str.append(entry.getKey());
            }
        }
        return str.toString();
        
    }
}
