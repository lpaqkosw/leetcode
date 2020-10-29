public class p00070 {
    public static int climbStairs(int n) {
        return dfs(0,n);
    }

    public static int dfs(int current, int target){
        int sum;
        if(current == target){
            return 1;
        } if(current > target){
            return 0;
        }
        sum = dfs(current+1,target)+dfs(current+2,target);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(dfs(0,3));
    }
}
