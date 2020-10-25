import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p1 {

    public static void main(String[] args) {
        int[] in = new int[] {2,7,11,15};
        int[] res = twoSum(in, 9);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int tmp = target - nums[i];
            if(map.containsKey(tmp)){
                return new int[] {map.get(tmp),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
