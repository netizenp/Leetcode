package medium;

public class InsertIntoABinarySearchTree_701 {
	public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val, null, null);
            return root;
        }
        if(val < root.val){
            root.left = insertIntoBST(root.left, val);
        }
        else if(val > root.val){
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
