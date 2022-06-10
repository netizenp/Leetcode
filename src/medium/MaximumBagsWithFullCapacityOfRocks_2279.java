package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*You have n bags numbered from 0 to n - 1. You are given two 0-indexed integer arrays capacity and rocks.
 * The ith bag can hold a maximum of capacity[i] rocks and currently contains rocks[i] rocks. 
 * You are also given an integer additionalRocks, the number of additional rocks you can place in any of the bags.

Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.

 

Example 1:

Input: capacity = [2,3,4,5], rocks = [1,2,4,4], additionalRocks = 2
Output: 3
Explanation:
Place 1 rock in bag 0 and 1 rock in bag 1.
The number of rocks in each bag are now [2,3,4,4].
Bags 0, 1, and 2 have full capacity.
There are 3 bags at full capacity, so we return 3.
It can be shown that it is not possible to have more than 3 bags at full capacity.
Note that there may be other ways of placing the rocks that result in an answer of 3.
Example 2:

Input: capacity = [10,2,2], rocks = [2,2,0], additionalRocks = 100
Output: 3
Explanation:
Place 8 rocks in bag 0 and 2 rocks in bag 2.
The number of rocks in each bag are now [10,2,2].
Bags 0, 1, and 2 have full capacity.
There are 3 bags at full capacity, so we return 3.
It can be shown that it is not possible to have more than 3 bags at full capacity.
Note that we did not use all of the additional rocks.*/

public class MaximumBagsWithFullCapacityOfRocks_2279 {
	public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        List<Integer> l = new ArrayList<>();
        int count = 0;
        for(int i=0;i<capacity.length;i++){
            l.add(capacity[i] - rocks[i]);
        }
        Collections.sort(l);
        int i = 0;
        System.out.println(l.size());
        while(i < l.size() && additionalRocks != 0){
            if(l.get(i) == 0){
                count++;
                i++;
            }
            else{
                if(l.get(i) <= additionalRocks){
                    additionalRocks = additionalRocks - l.get(i);
                    count++;
                    i++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
