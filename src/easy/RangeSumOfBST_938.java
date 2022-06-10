package easy;

/*Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

Example 1:
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.

Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23. 
 */

public class RangeSumOfBST_938 {
	int ans = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root.left != null){
            //System.out.println("Going left from: " + root.val);
            rangeSumBST(root.left, low, high);
            //System.out.println("Again on: " + root.val + " and ans: " + ans);
        }
        if(root.right != null){
            //System.out.println("Going right from: " + root.val);
            rangeSumBST(root.right, low, high);
            //System.out.println("Again on: " + root.val + " and ans: " + ans);
        }
        if(root.val >= low && root.val <= high){
            return ans += root.val;
        }
        return ans;
        /*if (root == null){
            return 0;
        }
        rangeSumBST(root.left, low, high);
        if(root.val >= low && root.val <= high){
            ans += root.val;
        }
        rangeSumBST(root.right, low, high);
        
        return ans;
        */
    }
}
