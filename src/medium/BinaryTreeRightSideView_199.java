package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView_199 {
	public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> l = new ArrayList<>();
        if(root!=null){
            q.add(root);
        }
        while(!q.isEmpty()){
            int n = q.size();
            while(n-->0){
                TreeNode temp = q.remove();
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                if(n == 0){
                    l.add(temp.val);
                }
            }
        }
        return l;
    }
}
