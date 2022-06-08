package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.
		
		Input: root = [5,3,6,2,4,null,7], k = 9
		Output: true
		
		Input: root = [5,3,6,2,4,null,7], k = 28
		Output: false*/

public class TwoSumIV_InputIsABST_653 {
	public boolean findTarget(TreeNode root, int k) {
		List<Integer> l = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		if (root != null) {
			q.add(root);
		}
		while (!q.isEmpty()) {
			TreeNode temp = q.peek();
			if (!l.isEmpty()) {
				int data = temp.val;
				if (l.contains(k - data)) {
					return true;
				}
			}
			l.add(temp.val);
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
			q.remove();
		}
		return false;
	}
}
