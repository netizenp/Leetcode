package easy;

/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
		
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/

public class ReverseString_344 {
	public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<s.length/2;i++,j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
