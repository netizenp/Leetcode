package medium;

/*Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters.
 *  If no such two words exist, return 0.

Example 1:

Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
Output: 16
Explanation: The two words can be "abcw", "xtfn".
Example 2:

Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
Output: 4
Explanation: The two words can be "ab", "cd".
Example 3:

Input: words = ["a","aa","aaa","aaaa"]
Output: 0
Explanation: No such pair of words.*/

public class MaximumProductOfWordLengths_318 {
	public int maxProduct(String[] words) {
        int count = 0;
        int[] b = new int[words.length];
        for(int i=0;i<words.length;i++) {
            for(int j=0;j<words[i].length();j++) {
                b[i] |= (1 << (words[i].charAt(j) - 'a'));
            }
            for(int j=0; j<i; j++) {
                if( (b[i] & b[j]) == 0 ) {
                    count = Math.max(count, words[i].length()*words[j].length());
                }
            }
        }
        return count;
    }
}
