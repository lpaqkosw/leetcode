import java.util.Arrays;

public class p00066 {
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        for(int i = digits.length-1;i>0;i--){
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1]++;
            }
        }
        if(digits[0] == 10){
            digits[0] = 0;
            int[] result = new int[digits.length+1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else{
            return digits;
        }
    }

    public static void main(String[] args) {
        // int[] in = new int[] {1,2,3};
        // int[] in = new int[] {4,3,2,1};
        // int[] in = new int[] {0};
        // int[] in = new int[] {9,9,9,9};
        int[] in = new int[] {1,9,9,9};

        System.out.println(Arrays.toString(plusOne(in)));
    }
}
