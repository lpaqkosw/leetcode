import java.util.LinkedList;
import java.util.Queue;

public class p00101b {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode a = q.poll();
            TreeNode b = q.poll();
            if(!check(a,b)) return false;
            if(a!=null){
                q.offer(a.left);
                q.offer(b.right);
                q.offer(a.right);
                q.offer(b.left);
            } else{
                continue;
            }
        }
        return true;
    }

    public boolean check(TreeNode a, TreeNode b){
        if(a==null && b == null) return true;
        if(a==null || b==null) return false;
        if(a.val != b.val){
            return false;
        } else{
            return true;
        }
    }

}
