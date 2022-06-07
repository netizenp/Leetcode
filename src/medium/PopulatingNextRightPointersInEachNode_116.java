package medium;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode_116 {
	public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        while(!q.isEmpty()){
            int n = q.size();
            while(n-->0){
                Node temp = q.remove();
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                if(n > 0){
                    temp.next = q.peek();
                }
            }
        }
        return root;
    }
}
