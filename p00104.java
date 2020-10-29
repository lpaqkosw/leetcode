public class p00104 {

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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return dfs(root,1);

    }
    
    public int dfs(TreeNode root, int cnt){
        if(root == null){
            return cnt-1;
        }
        if(root.left == null && root.right==null){
            return cnt;
        }
        int a = dfs(root.left,cnt+1);
        int b = dfs(root.right,cnt+1);
        return a>=b? a:b;

    }
}
