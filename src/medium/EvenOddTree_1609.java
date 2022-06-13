package medium;

import java.util.LinkedList;
import java.util.Queue;

/*A binary tree is named Even-Odd if it meets the following conditions:

The root of the binary tree is at level index 0, its children are at level index 1, their children are at level index 2, etc.
For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
For every odd-indexed level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false.

Example 1:
Input: root = [1,10,4,3,null,7,9,12,8,6,null,null,2]
Output: true
Explanation: The node values on each level are:
Level 0: [1]
Level 1: [10,4]
Level 2: [3,7,9]
Level 3: [12,8,6,2]
Since levels 0 and 2 are all odd and increasing and levels 1 and 3 are all even and decreasing, the tree is Even-Odd.

Example 2:
Input: root = [5,4,2,3,3,7]
Output: false
Explanation: The node values on each level are:
Level 0: [5]
Level 1: [4,2]
Level 2: [3,3,7]
Node values in level 2 must be in strictly increasing order, so the tree is not Even-Odd.

Example 3:
Input: root = [5,9,1,3,5,7]
Output: false
Explanation: Node values in the level 1 should be even integers.*/

public class EvenOddTree_1609 {
	public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null){
            q.add(root);
        }
        int evenVal = Integer.MIN_VALUE, oddVal = Integer.MAX_VALUE;
        boolean even = false;
        while(!q.isEmpty()){
            int n = q.size();
            evenVal = Integer.MIN_VALUE;
            oddVal = Integer.MAX_VALUE;
            even = !even;
            while(n-->0){
                TreeNode node = q.peek();
                if(even == false){
                    if(oddVal > node.val && node.val%2 == 0){
                        oddVal = node.val;
                    }
                    else{
                        return false;
                    }
                }
                else if(even == true){
                    if(evenVal < node.val && node.val%2 != 0){
                        evenVal = node.val;
                    }
                    else{
                        return false;
                    }
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                q.remove();
            }
        }
        return true;
    }
}
