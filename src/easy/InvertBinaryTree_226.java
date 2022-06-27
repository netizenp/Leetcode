package easy;

import java.util.LinkedList;
import java.util.Queue;

/*Given the root of a binary tree, invert the tree, and return its root.

Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]

Example 2:
Input: root = [2,1,3]
Output: [2,3,1]

Example 3:
Input: root = []
Output: []*/

public class InvertBinaryTree_226 {
	public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return null;
        }
        q.add(root);
        while(!q.isEmpty()){
            TreeNode it = q.peek();
            TreeNode temp = it.left;
            it.left = it.right;
            it.right = temp;
            if(it.left != null){
                q.add(it.left);
            }
            if(it.right != null){
                q.add(it.right);
            }
            q.remove();
        }
        return root;
    }
}
