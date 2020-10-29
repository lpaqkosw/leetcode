public class p00053 {
    public static int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int sum=0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
            sum+=nums[i];
            max = sum>max? sum:max;
            sum = sum<0? 0:sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
