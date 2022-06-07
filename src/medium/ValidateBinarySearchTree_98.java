package medium;

import java.util.ArrayList;
import java.util.List;

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

public class ValidateBinarySearchTree_98 {
	List<Integer> l = new ArrayList<>();

	public boolean isValidBST(TreeNode root) {
		inOrderTraversal(root);
		for (int i = 1; i < l.size(); i++) {
			if (l.get(i - 1) >= l.get(i)) {
				return false;
			}
		}
		return true;
	}

	public void inOrderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.left);
		l.add(root.val);
		inOrderTraversal(root.right);
	}
}
