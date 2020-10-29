public class p00007 {
    public static int reverse(int x) {
        // boolean positive = x >= 0? true:false;
        // String str = Integer.toString(x);
        // str = str.replace("-", "");
        // long res = 0;
        // for(int i = 0; i < str.length(); i++){
        //     res+=(Integer.parseInt(String.valueOf(str.charAt(i)))*Math.pow(10,i));
        //     if(res > Integer.MAX_VALUE) return 0;
        // }
        // if(!positive){
        //     res= res*-1;
        // }
        // return (int) res;
        StringBuffer sb = new StringBuffer();
        String reversed = sb.append(Math.abs(x)).reverse().toString();
        try {
            return x<0? Integer.parseInt(reversed)*-1:Integer.parseInt(reversed);
        } catch (Exception e) {
            //TODO: handle exception
            return 0;
        }
    }

    public static void main(String[] args) {
        // int input = -2147483648;
        int input = -1999999999;
        // System.out.println(reverse(input));
        System.out.println(reverse(input));

    }
}
