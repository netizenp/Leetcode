package medium;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*Given an array of strings words and an integer k, return the k most frequent strings.

Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

 

Example 1:

Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:

Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.*/

public class TopKFrequentWords_692 {
	public List<String> topKFrequent(String[] words, int k) {
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        List<String> l = new ArrayList<>();
        for(String s : words){
            mp.put(s, mp.getOrDefault(s,0) + 1);
        }
        Map<String, Integer> sortedMap = mp.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new)).entrySet().stream().sorted((o1, o2) -> {
					if(o1.getValue() == o2.getValue()) {
						return o1.getKey().compareTo(o2.getKey());
					}
					return 0;
				}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        
        for(Map.Entry<String, Integer> map : sortedMap.entrySet()){
            if(k>0){
                l.add(map.getKey());
                k--;
            }
        }
        return l;
    }
}
