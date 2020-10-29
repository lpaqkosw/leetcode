public class p00028 {
    public static int strStr(String haystack, String needle) {
        if(needle.length() ==0 || haystack.equals(needle)) return 0;
        if(haystack.length()<needle.length() ) return -1;
        char comp = needle.charAt(0);
        for(int i = 0; i < haystack.length()-needle.length()+1; i++){
            if(haystack.charAt(i)==comp){
                int x = 0;
                for(int j = i; j < i+needle.length();j++){
                    if(haystack.charAt(j)!=needle.charAt(x)){
                        break;
                    }else{
                        x++;
                    }
                }
                if(x == needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // String haystack = "hello";
        // String needle = "ll";
        // String haystack = "aaaaaa";
        // String needle = "bba";
        // String haystack = "";
        // String needle = "";
        // String haystack = "Geekfogeeksforgeek";
        // String needle = "for";
        String haystack = "Mississippi";
        String needle = "issipi";
        
        System.out.println(strStr(haystack, needle));
    }
}
