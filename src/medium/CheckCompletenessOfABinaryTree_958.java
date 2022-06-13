package medium;

import java.util.LinkedList;
import java.util.Queue;

/*Given the root of a binary tree, determine if it is a complete binary tree.

In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

Example 1:
Input: root = [1,2,3,4,5,6]
Output: true
Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.

Example 2:
Input: root = [1,2,3,4,5,null,7]
Output: false
Explanation: The node with value 7 isn't as far left as possible.*/

public class CheckCompletenessOfABinaryTree_958 {
	public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return true;
        }
        else{
            q.add(root);
        }
        boolean flag = false;
        while(!q.isEmpty()){
            TreeNode temp = q.peek();
            if(temp == null){
                flag = true;
            }
            else{
                if(flag == true){
                    return false;
                }
                q.add(temp.left);
                q.add(temp.right);
            }
            q.remove();
        }
        return true;
    }
}
