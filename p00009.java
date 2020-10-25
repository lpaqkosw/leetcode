public class p00009 {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        StringBuffer sb = new StringBuffer();
        String t1 = sb.append(x).reverse().toString();
        sb = new StringBuffer();
        return t1.equals(sb.append(x).toString());
       
    }

    public static void main(String[] args) {
        
    }
}
