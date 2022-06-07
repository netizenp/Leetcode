package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class SearchInABinarySearchTree_700 {
	public TreeNode searchBST(TreeNode root, int val) {
		Queue<TreeNode> q = new LinkedList<>();
		List<Integer> l = new ArrayList<>();
		if (root != null) {
			q.add(root);
		}
		while (!q.isEmpty()) {
			int n = q.size();
			while (n-- > 0) {
				TreeNode temp = q.remove();
				if (temp.left != null) {
					q.add(temp.left);
				}
				if (temp.right != null) {
					q.add(temp.right);
				}
				if (temp.val == val) {
					return temp;
				}
			}
		}
		return null;
	}
}
