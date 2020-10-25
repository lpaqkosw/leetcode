public class p14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length ==0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            String comp = strs[i];
            int length = prefix.length();
            for(int j = 0; j < length;j++){
                try {
                    if(prefix.charAt(j) != comp.charAt(j)){
                        prefix = prefix.substring(0, j);
                        break;
                    }
                } catch (Exception e) {
                    prefix = prefix.substring(0, j);
                    break;
                }

                
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        // String[] strs = new String[] {"flower","flow","flight"};
        // String[] strs = new String[] {"dogs","racecar","car"};
        // String[] strs = new String[] {"ab","a"};
        String str = "leets";
        String str2 = "leetcode";
        System.out.println(str2.indexOf(str));
        // System.out.println(longestCommonPrefix(strs));
    }
}
