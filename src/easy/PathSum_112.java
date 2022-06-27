package easy;

/*Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

Example 1:
Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.

Example 2:
Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.

Example 3:
Input: root = [], targetSum = 0
Output: false
Explanation: Since the tree is empty, there are no root-to-leaf paths.*/

public class PathSum_112 {
	public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSumFinding(root, 0, targetSum);
    }
    
    public boolean pathSumFinding(TreeNode root, int s, int targetSum){
        if(root == null){
            return false;
        }
        s += root.val;
        if(root.left == null && root.right == null && s == targetSum){
            return true;
        }
        if(pathSumFinding(root.left, s, targetSum)){
            return true;
        }
        if(pathSumFinding(root.right, s, targetSum)){
            return true;
        }
        return false;
    }
}
